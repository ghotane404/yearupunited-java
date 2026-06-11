package com.pluralsight.services;

import com.pluralsight.models.Employee;

import java.util.ArrayList;

public interface EmployeeDao {
	ArrayList<Employee> getEmployeesByTerritory(int searchTerritoryId);

	Employee getEmployee(int EmployeeId);

	void addEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void deleteEmployee(int EmployeeId);

}
