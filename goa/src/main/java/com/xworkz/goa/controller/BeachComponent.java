package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.BeachDTO;

@Component
@RequestMapping("/beach")
public class BeachComponent {

	public BeachComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String doSend(BeachDTO dto, Model model) {
		System.out.println("Running doSend");
		System.out.println(dto);
		model.addAttribute("name", dto.getName());
		model.addAttribute("location", dto.getLocation());
		model.addAttribute("clean", dto.isClean());
		model.addAttribute("games", dto.isGames());
		return "BeachSuccess.jsp";
	}
}
