package com.pluralsight.controllers;

import com.pluralsight.models.Employee;
import com.pluralsight.services.EmployeeDao;
import com.pluralsight.services.TerritoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeesController {
//	private TerritoryDao territoryDao;
//	private EmployeeDao employeeDao;
//
//	@Autowired
//	public EmployeesController(TerritoryDao territoryDao, EmployeeDao employeeDao) {
//		this.territoryDao = territoryDao;
//		this.employeeDao = employeeDao;
//	}
//
//	// list all employees
//	@GetMapping("/employees")
//	public String employees(Model model, @RequestParam(name = "tid", defaultValue = "1") int territoryId) {
//		model.addAttribute("employees", employeeDao.getEmployeesByTerritory(territoryId));
//		model.addAttribute("territory", territoryDao.getTerritory(territoryId));
//		return "employees/index";
//	}
//
//	// details page
//	@GetMapping("/employees/{id}")
//	public String getEmployee(Model model, @PathVariable int id) {
//		var employee = employeeDao.getEmployee(id);
//
//		if (employee == null) {
//			return "404";
//		}
//
//		var territory = territoryDao.getTerritory(employee.getTerritoryId());
//
//		model.addAttribute("territory", territory);
//		model.addAttribute("employee", employee);
//		return "employees/details";
//	}
//
//	// add territory
//	@GetMapping("/employees/new")
//	public String addTerritory(Model model, @RequestParam(name = "tid", defaultValue = "1") int territoryId) {
//		model.addAttribute("territories",  territoryDao.getTerritories());
//		model.addAttribute("employee", new Employee() {{
//			setTerritoryId(territoryId);
//		}});
//		return "employees/add";
//	}
//
//	@PostMapping("/employees/new")
//	public String saveTerritory(@ModelAttribute("employee") Employee employee) {
//		employeeDao.addEmployee(employee);
//		return "redirect:/employees";
//	}
//
//	// edit territory
//	@GetMapping("/employees/{id}/edit")
//	public String editTerritory(Model model, @PathVariable int id) {
//		var employee = employeeDao.getEmployee(id);
//
//		if (employee == null) {
//			return "404";
//		}
//
//		model.addAttribute("territories", territoryDao.getTerritories());
//		model.addAttribute("employee", employee);
//		return "employees/edit";
//	}
//
//	@PostMapping("/employees/{id}/edit")
//	public String editTerritory(@ModelAttribute("employee") Employee employee, @PathVariable int id) {
//		var currentEmployee = employeeDao.getEmployee(id);
//
//		if (currentEmployee == null) {
//			return "404";
//		}
//
//		employee.setEmployeeId(id);
//		employeeDao.updateEmployee(employee);
//
//		return "redirect:/employees";
//	}
//
//
//	// edit territory
//	@GetMapping("/employees/{id}/delete")
//	public String deleteEmployee(Model model, @PathVariable int id) {
//		var employee = employeeDao.getEmployee(id);
//
//		if (employee == null) {
//			return "404";
//		}
//
//		var territory = territoryDao.getTerritory(employee.getEmployeeId());
//
//		model.addAttribute("territory", territory);
//		model.addAttribute("employee", employee);
//		return "employees/delete";
//	}
//
//	@PostMapping("/employees/{id}/delete")
//	public String deleteCategoryConfirm(@PathVariable int id) {
//		var currentEmployee = employeeDao.getEmployee(id);
//
//		if (currentEmployee == null) {
//			return "404";
//		}
//
//		employeeDao.deleteEmployee(id);
//
//		return "redirect:/employees";
//	}


}
