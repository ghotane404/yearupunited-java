package com.pluralsight.controllers;

import com.pluralsight.models.Region;
import com.pluralsight.services.RegionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegionsController {
	private RegionDao regionDao;

	@Autowired
	public RegionsController(RegionDao regionDao) {
		this.regionDao = regionDao;
	}

	// list all regions
	@GetMapping("/regions")
	public String regions(Model model) {
		model.addAttribute("regions", regionDao.getRegions());
		return "regions/index";
	}

	// details page
	@GetMapping("/regions/{id}")
	public String getRegion(Model model, @PathVariable int id) {
		var regions = regionDao.getRegion(id);

		if (regions == null) {
			return "404";
		}
		model.addAttribute("regions", regions);
		return "regions/details";
	}

	// add region
	@GetMapping("/regions/new")
	public String addRegion(Model model) {
		model.addAttribute("region", new Region());
		return "regions/add";
	}

	@PostMapping("/regions/new")
	public String saveCategory(@ModelAttribute("region") Region region) {
		regionDao.addRegion(region);
		return "redirect:/regions";
	}

	// edit region
	@GetMapping("/regions/{id}/edit")
	public String editCategory(Model model, @PathVariable int id) {
		var region = regionDao.getRegion(id);

		if (region == null) {
			return "404";
		}

		model.addAttribute("region", region);
		return "regions/edit";
	}

	@PostMapping("/regions/{id}/edit")
	public String editCategory(@ModelAttribute("region") Region region, @PathVariable int id) {
		var currentRegion = regionDao.getRegion(id);

		if (currentRegion == null) {
			return "404";
		}

		regionDao.updateRegion(region);

		return "redirect:/regions";
	}


	// edit region
	@GetMapping("/regions/{id}/delete")
	public String deleteCategory(Model model, @PathVariable int id) {
		var region = regionDao.getRegion(id);

		if (region == null) {
			return "404";
		}

		model.addAttribute("region", region);
		return "regions/delete";
	}

	@PostMapping("/regions/{id}/delete")
	public String deleteCategoryConfirm(@PathVariable int id) {
		var currentRegion = regionDao.getRegion(id);

		if (currentRegion == null) {
			return "404";
		}

		regionDao.deleteRegion(id);

		return "redirect:/regions";
	}
	
	
}
