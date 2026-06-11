package com.pluralsight.services.mysql;

import com.pluralsight.models.Employee;
import com.pluralsight.services.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
public class MySqlEmployeeDao implements EmployeeDao {
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public MySqlEmployeeDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@GetMapping("/employees")
	public ArrayList<Employee> getEmployeesByTerritory(int searchTerritoryId) {
		ArrayList<Employee> employees = new ArrayList<>();

		String sql = """
				    SELECT EmployeeID
				        , TerritoryID
				        , FirstName
				        , LastName
				        , Title
				        , HireDate
				        , ReportsTo
				        , Salary
				    FROM employees
				    WHERE TerritoryID = ?
				    ORDER BY TerritoryID
				            , EmployeeName
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
				         , e.ReportsTo
				         , e.Salary
				          FROM Employees e
				          JOIN EmployeeTerritories et
				              ON e.EmployeeID = et.EmployeeID
				          WHERE et.TerritoryID = ?
				          ORDER BY e.LastName, e.FirstName
				""";

		SqlRowSet row = jdbcTemplate.queryForRowSet(sql, employeeId);

		if (row.next()) {
			Employee employee = mapRowToEmployee(row);
			return employee;
		}
		return null;}

	public ArrayList<Employee> getEmployeesByTerritory(String searchTerritoryId) {
		ArrayList<Employee> employees = new ArrayList<>();

		String sql = """
				SELECT e.EmployeeID
				     , et.TerritoryID
				     , e.FirstName
				     , e.LastName
				     , e.Title
				     , e.HireDate
				     , e.ReportsTo
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

	public void addEmployee(Employee employee) {
		String sql = """
				INSERT INTO employees (EmployeeID, TerritoryID, FirstName, LastName, Title, HireDate, ReportsTo, Salary)
				VALUES (?, ?, ?, ?, ?, ?, ?);
				""";

		jdbcTemplate.update(sql
				, employee.getFirstName()
				, employee.getLastName()
				, employee.getTitle()
				, employee.getHireDate()
				, employee.getReportsTo()
				, employee.getSalary()
				, employee.getEmployeeId());
	}

	public void updateEmployee(Employee employee) {
		String sql = """
				UPDATE Employees
				SET FirstName = ?
				  , LastName = ?
				  , Title = ?
				  , HireDate = ?
				  , ReportsTo = ?
				  , Salary = ?
				WHERE EmployeeID = ?
				""";

		jdbcTemplate.update(sql
				, employee.getFirstName()
				, employee.getLastName()
				, employee.getTitle()
				, employee.getHireDate()
				, employee.getReportsTo()
				, employee.getSalary()
				, employee.getEmployeeId());
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
		LocalDateTime hireDate = row.getTimestamp("HireDate").toLocalDateTime();
		int reportsTo = row.getInt("ReportsTo");
		double salary = row.getDouble("Salary");

		return new Employee(employeeId, territoryId, firstName, lastName, title, hireDate, reportsTo, salary);
	}

}
