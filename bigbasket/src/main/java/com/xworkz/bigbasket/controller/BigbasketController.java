package com.xworkz.bigbasket.controller;

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

import com.xworkz.bigbasket.dto.BigbasketDTO;
import com.xworkz.bigbasket.service.BigbasketService;

@Component
@RequestMapping("/")
public class BigbasketController {
	
	@Autowired
	private BigbasketService bigbasketService;

	List<String> items = Arrays.asList("Tommato", "potato","onion", "Beetroot", "corrionder","groceries");
	List<String> areas = Arrays.asList("Rajajinagar", "BTM","Nandini layout", "Bagalkot", "Navanagar","Rajkumar Road");
	
	public BigbasketController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/bigbasket")
	public String onClick(Model model) {
		System.out.println("Running onClick by get method");
		model.addAttribute("items", items);
		model.addAttribute("areas", areas);
		return "Bigbasket"; 
	}
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id " + id);
		BigbasketDTO dto = this.bigbasketService.findById(id);
		if(dto != null) {
			model.addAttribute("dto", dto);
		}
		else {
			model.addAttribute("message", "Data not found");
		}
		return "Search";
	}
	
	@PostMapping("/bigbasket")
	public String onClick(BigbasketDTO dto, Model model) {
		System.out.println("Running onClick by post method");
		System.out.println(dto);
		Set<ConstraintViolation<BigbasketDTO>> violation = this.bigbasketService.validateAndSave(dto);
		if(violation.isEmpty()) {
			System.out.println("no violation can move to success page");
			return "BigbasketSuccess";
		}
		model.addAttribute("items", items);
		model.addAttribute("areas", areas);
		model.addAttribute("error", violation);
		model.addAttribute("dto", dto);
		System.out.println("violations in component class");
		return "Bigbasket"; 
	}
	
}
