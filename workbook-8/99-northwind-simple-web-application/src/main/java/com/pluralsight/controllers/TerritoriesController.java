package com.pluralsight.controllers;

import com.pluralsight.models.Territory;
import com.pluralsight.services.RegionDao;
import com.pluralsight.services.TerritoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TerritoriesController {
	private RegionDao regionDao;
	private TerritoryDao territoryDao;

	@Autowired
	public TerritoriesController(RegionDao regionDao, TerritoryDao territoryDao) {
		this.regionDao = regionDao;
		this.territoryDao = territoryDao;
	}

	// list all territories
	@GetMapping("/territories")
	public String territories(Model model, @RequestParam(name = "tid", defaultValue = "1") int regionId) {
		model.addAttribute("territories", territoryDao.getTerritoriesByRegion(regionId));
		model.addAttribute("regions", regionDao.getRegion(regionId));
		return "territories/index";
	}

	// details page
	@GetMapping("/territories/{id}")
	public String getTerritory(Model model, @PathVariable int id) {
		var territory = territoryDao.getTerritory(id);

		if (territory == null) {
			return "404";
		}

		var region = regionDao.getRegion(territory.getRegionId());

		model.addAttribute("region", region);
		model.addAttribute("territory", territory);
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
