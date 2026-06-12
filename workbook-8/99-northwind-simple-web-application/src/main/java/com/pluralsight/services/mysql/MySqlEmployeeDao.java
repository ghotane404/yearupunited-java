package com.pluralsight.services.mysql;

import com.pluralsight.models.Employee;
import com.pluralsight.services.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class MySqlEmployeeDao implements EmployeeDao {
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public MySqlEmployeeDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public ArrayList<Employee> getEmployeesByTerritory(int searchTerritoryId) {
		ArrayList<Employee> employees = new ArrayList<>();

		String sql = """
				    SELECT e.EmployeeID
				         , et.TerritoryID
				         , e.FirstName
				         , e.LastName
				         , e.Title
				         , e.HireDate
				         , e.Notes
				         , e.Salary
				          FROM Employees e
				          JOIN EmployeeTerritories et
				              ON e.EmployeeID = et.EmployeeID
				          WHERE et.TerritoryID = ?
				          ORDER BY e.LastName, e.FirstName
				""";

		SqlRowSet row = jdbcTemplate.queryForRowSet(sql, searchTerritoryId);

		while (row.next()) {
			Employee employee = mapRowToEmployee(row);
			employees.add(employee);
		}

		return employees;
	}

	public Employee getEmployee(int employeeId) {

		String sql = """
				    SELECT e.EmployeeID
				         , et.TerritoryID
				         , e.FirstName
				         , e.LastName
				         , e.Title
				         , e.HireDate
				         , e.Notes
				         , e.Salary
					FROM Employees e
					JOIN EmployeeTerritories et
						ON e.EmployeeID = et.EmployeeID
					WHERE e.EmployeeID = ?
				""";

		SqlRowSet row = jdbcTemplate.queryForRowSet(sql, employeeId);

		if (row.next()) {
			Employee employee = mapRowToEmployee(row);
			return employee;
		}
		return null;
	}

	public void addEmployee(Employee employee) {
		String sql = """
				INSERT INTO employees (EmployeeID, TerritoryID, FirstName, LastName, Title, HireDate, Notes, Salary)
				VALUES (?, ?, ?, ?, ?, ?, ?);
				""";

		jdbcTemplate.update(sql
				, employee.getEmployeeId()
				, employee.getTerritoryId()
				, employee.getFirstName()
				, employee.getLastName()
				, employee.getTitle()
				, employee.getHireDate()
				, employee.getNotes()
				, employee.getSalary());
	}

	public void updateEmployee(Employee employee) {
		String sql = """
				UPDATE employees
				SET FirstName = ?
				  , LastName = ?
				  , Title = ?
				  , HireDate = ?
				  , Notes = ?
				  , Salary = ?
				WHERE EmployeeID = ?
				""";

		jdbcTemplate.update(sql
				, employee.getFirstName()
				, employee.getLastName()
				, employee.getTitle()
				, employee.getHireDate()
				, employee.getNotes()
				, employee.getSalary());
	}

	public void deleteEmployee(int id) {
		String sql = """
				DELETE FROM employees
				WHERE EmployeeID = ?;
				""";

		jdbcTemplate.update(sql, id);
	}

	private Employee mapRowToEmployee(SqlRowSet row) {
		int employeeId = row.getInt("EmployeeID");
		int territoryId = row.getInt("TerritoryID");
		String firstName = row.getString("FirstName");
		String lastName = row.getString("LastName");
		String title = row.getString("Title");
		LocalDateTime hireDate = (LocalDateTime) row.getObject("HireDate");
		String notes = row.getString("Notes");
		double salary = row.getDouble("Salary");

		return new Employee(employeeId, territoryId, firstName, lastName, title, hireDate, notes, salary);
	}
}
