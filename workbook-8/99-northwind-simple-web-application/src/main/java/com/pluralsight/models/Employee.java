package com.pluralsight.models;

import java.time.LocalDateTime;

public class Employee {
	private int employeeId;
	private int territoryId;
	private String firstName;
	private String lastName;
	private String title;
	private LocalDateTime hireDate;
	private String notes;
	private double salary;

	public Employee(int employeeId, int territoryId, String firstName, String lastName, String title, LocalDateTime hireDate, String notes, double salary) {
		this.employeeId = employeeId;
		this.territoryId = territoryId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.hireDate = hireDate;
		this.notes = notes;
		this.salary = salary;
	}

	public Employee() {
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getTerritoryId() {
		return territoryId;
	}

	public void setTerritoryId(int territoryId) {
		this.territoryId = territoryId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDateTime hireDate) {
		this.hireDate = hireDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}