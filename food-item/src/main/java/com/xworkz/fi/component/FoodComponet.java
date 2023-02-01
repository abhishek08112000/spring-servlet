package com.xworkz.fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/devil")
public class FoodComponet {

	public FoodComponet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String doSend(@RequestParam String name, @RequestParam String type, @RequestParam int quantity, @RequestParam double price) {
		System.out.println("Running doSend method....");
		System.out.println("Food Name "+ name);
		System.out.println("Food type "+ type);
		System.out.println("Food quantity "+ quantity);
		System.out.println("Food price "+ price);
		return "foodItem.jsp";
	}
}
