package com.pluralsight.controllers;

import com.pluralsight.models.Category;
import com.pluralsight.models.Territory;
import com.pluralsight.services.TerritoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TerritoriesController {
	private TerritoryDao territoryDao;

	@Autowired
	public TerritoriesController(TerritoryDao territoryDao) {
		this.territoryDao = territoryDao;
	}

	// list all territories
	@GetMapping("/territories")
	public String territories(Model model) {
		model.addAttribute("territories", territoryDao.getTerritories());
		return "territories/index";
	}

	// details page
	@GetMapping("/territories/{id}")
	public String getTerritory(Model model, @PathVariable int id) {
		var territories = territoryDao.getTerritory(id);

		if (territories == null) {
			return "404";
		}
		model.addAttribute("territories", territories);
		return "territories/details";
	}

	// add territory
	@GetMapping("/territories/new")
	public String addTerritory(Model model) {
		model.addAttribute("territory", new Territory());
		return "territories/add";
	}

	@PostMapping("/territories/new")
	public String saveCategory(@ModelAttribute("territory") Territory territory) {
		territoryDao.addTerritory(territory);
		return "redirect:/territories";
	}

	// edit territory
	@GetMapping("/territories/{id}/edit")
	public String editCategory(Model model, @PathVariable int id) {
		var territory = territoryDao.getTerritory(id);

		if (territory == null) {
			return "404";
		}

		model.addAttribute("territory", territory);
		return "territories/edit";
	}

	@PostMapping("/territories/{id}/edit")
	public String editCategory(@ModelAttribute("territory") Territory territory, @PathVariable int id) {
		var currentTerritory = territoryDao.getTerritory(id);

		if (currentTerritory == null) {
			return "404";
		}

		territoryDao.updateTerritory(territory);

		return "redirect:/territories";
	}


	// edit territory
	@GetMapping("/territories/{id}/delete")
	public String deleteCategory(Model model, @PathVariable int id) {
		var territory = territoryDao.getTerritory(id);

		if (territory == null) {
			return "404";
		}

		model.addAttribute("territory", territory);
		return "territories/delete";
	}

	@PostMapping("/territories/{id}/delete")
	public String deleteCategoryConfirm(@PathVariable int id) {
		var currentTerritory = territoryDao.getTerritory(id);

		if (currentTerritory == null) {
			return "404";
		}

		territoryDao.deleteTerritory(id);

		return "redirect:/territories";
	}

}
