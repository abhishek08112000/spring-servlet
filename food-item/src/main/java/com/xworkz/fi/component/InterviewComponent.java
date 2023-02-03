package com.xworkz.fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.fi.dto.InterviewDTO;

@Component
@RequestMapping("/attend")
public class InterviewComponent {

	public InterviewComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String doAttend(InterviewDTO dto) {
		System.out.println("Running doAttend...");
		System.out.println(dto);
		return "interview.jsp";
	}
}
