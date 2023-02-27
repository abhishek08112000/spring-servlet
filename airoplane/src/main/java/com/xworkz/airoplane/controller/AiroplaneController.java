package com.xworkz.airoplane.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.airoplane.dto.AiroplaneDTO;
import com.xworkz.airoplane.service.AiroplaneService;

@Component
@RequestMapping("/")
public class AiroplaneController {

	@Autowired
	private AiroplaneService airoplaneService;
	
	private List<String> type = Arrays.asList("Commercial", "Private Jet", "Private", "Government jet");

	private List<String> country = Arrays.asList("India", "U.S.A", "Austrailia", "Europe", "Russia");

	public AiroplaneController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/airoplane")
	public String onRegister(Model model) {
		System.out.println("Running onRegister by get method");

		model.addAttribute("type", type);
		model.addAttribute("country", country);
		return "Airoplane"; 
	}
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("running on search for id " + id);
		AiroplaneDTO dto = this.airoplaneService.findbyId(id);
		if(dto != null) {
			model.addAttribute("dto", dto);
		}
		else {
			model.addAttribute("message", "Data not found");
		}
		return "SearchAiroplane";
	}
	
	@PostMapping("/airoplane")
	public String onSave(AiroplaneDTO dto, Model model) {
		System.out.println("Running onSave by post method");
		System.out.println(dto);
		Set<ConstraintViolation<AiroplaneDTO>> violations = this.airoplaneService.validateAndSave(dto);
		if(violations.isEmpty()) {
			System.out.println("There is no violations data is saved");
			model.addAttribute("message", "Data Saved");
			return "Airoplane";
		}
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
		System.err.println("Violations in controller");
		return "Airoplane";
	}
}
