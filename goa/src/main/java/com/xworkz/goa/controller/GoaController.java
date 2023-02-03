package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CasinoDTO;

@Component
@RequestMapping("/maja")
public class GoaController {

	public GoaController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String doPlay(CasinoDTO dto, Model model) {
		System.out.println("Running doPlay");
		System.out.println(dto);
		model.addAttribute("name" ,dto.getName());
		model.addAttribute("cruiseName", dto.getCruiseName());
		model.addAttribute("entryFee", dto.getEntryFee());
		model.addAttribute("freeFood", dto.isFreeFood());
		return "CasinoSuccess.jsp";
	}
	
	
}
