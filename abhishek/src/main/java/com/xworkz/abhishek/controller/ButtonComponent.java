package com.xworkz.abhishek.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.abhishek.dto.BevarageDTO;
import com.xworkz.abhishek.dto.ChatDTO;
import com.xworkz.abhishek.dto.EducationDTO;
import com.xworkz.abhishek.dto.FamilyDTO;
import com.xworkz.abhishek.dto.MobileDTO;




@Component
@RequestMapping("/")
public class ButtonComponent {

	public ButtonComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/email")
	public String onSubmit(Model model) {
		System.out.println("Running onSubmit");
		model.addAttribute("email", "abhisheknayak.xworkz@gmail.com");
		return "index.jsp";
	}
	
	@GetMapping("/mobile")
	public String onClick(Model model) {
		System.out.println("Running noClick");
		model.addAttribute("mobile", 8431044112L);
		return "index.jsp";
	}
	
	@GetMapping("/adhar")
	public String onSend(Model model) {
		System.out.println("Running onSend.....");
		model.addAttribute("adhar", 397372142800L);
		return "index.jsp";
	}
	
	
	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("Running onAge.....");
		model.addAttribute("age", 23);
		return "index.jsp";
	}
	
	@GetMapping("/dob")
	public String onDob(Model model) {
		System.out.println("Running onDob.....");
		model.addAttribute("dob", LocalDateTime.of(2000, 11, 8, 07, 30));
		return "index.jsp";
	}
	
	
	@GetMapping("/salary")
	public String getSalary(Model model) {
		System.out.println("Running getSalary.....");
		model.addAttribute("salary", 25000);
		return "index.jsp";
	}
	
	@GetMapping("/friends")
	public String listOfBestFriend(Model model) {
		System.out.println("Running listOfBestFriend");
		List<String> ref = new ArrayList<String>();
		ref.add("Abhishek");
		ref.add("Satwik");
		ref.add("Lavanya");
		ref.add("Manjula");
		model.addAttribute("friends", ref);
		return "index.jsp";
	}
	
	@GetMapping("/place")
	public String listOfPlaces(Model model) {
		System.out.println("running listOfPlaces...");
		List<String> ref = new ArrayList<String>();
		ref.add("Dandeli");
		ref.add("Goa");
		ref.add("Murdeswara");
		ref.add("Mudhol");
		model.addAttribute("places", ref);
		return "index.jsp";
	}
	
	@GetMapping("/skills")
	public String listOfSkills(Model ref) {
		System.out.println("Running listOfSkills");
		List<String> data = new ArrayList<String>();
		data.add("Java");
		data.add("Html");
		data.add("CSS");
		data.add("Spring framework");
		data.add("Servlet and JSP");
		data.add("MySQL");
		ref.addAttribute("skills", data);
		return "index.jsp";
	}
	
	@GetMapping("/details")
	public String educationDetails(Model model) {
		System.out.println("Running educationDetails");
		EducationDTO dto = new EducationDTO();
		dto.setSchoolName("B.V.V.S high school");
		dto.setSchoolAddress("Vidyagiri");
		dto.setSslcScore(81);
		dto.setDiplomaCollegeName("Government Polytechnic");
		dto.setCollegeFees(1300);
		dto.setCollegeLocation("Navanagar");
		dto.setAggregateInpercentage(60);
		dto.setDegree("B.E");
		dto.setCollegeName("BGMIT college");
		dto.setLocation("Mudhol");
		dto.setCgpa(7.2);
		model.addAttribute("details", dto);
		return "index.jsp";
	}
	
	@GetMapping("/family")
	public String familyDetails(Model model) {
		System.out.println("Running familyDetails");
		FamilyDTO dto = new FamilyDTO();
		dto.setFatherName("Kotresh");
		dto.setMotherName("Gangubai");
		dto.setFatherOccupation("Business");
		dto.setNoOfSiblings(2);
		dto.setSisterName("Lavanya");
		dto.setBrotherName("Akash");
		dto.setMonthlyIncome(10000);
		dto.setMotheroccupation("Hose Wife");
		dto.setNoOfVehicles(2);
		dto.setLocation("Vidyagiri");
		
		model.addAttribute("family", dto);
		return "index.jsp";
	}
	
	@GetMapping("/mobileDTO")
	public String onMobile(Model ref) {
		System.out.println("Running onMobile...");
		MobileDTO mobileDTO = new MobileDTO();
		mobileDTO.setBrandName("OnePlus");
		mobileDTO.setModelName("Nord CE");
		mobileDTO.setColour("Blue");
		mobileDTO.setPrice(25000);
		mobileDTO.setIsWithCamera("true");
		
		ref.addAttribute("mobileDTO", mobileDTO);
		return "index.jsp";
	}
	
	@GetMapping("/drink")
	public String onBevarage(Model ref) {
		System.out.println("Running onBevarage");
		BevarageDTO bevarageDTO = new BevarageDTO();
		bevarageDTO.setBrandName("Nandini");
		bevarageDTO.setBevarageName("MilkShake");
		bevarageDTO.setMfgDate(LocalDate.of(2022, 12, 31));
		bevarageDTO.setExpiryDate(LocalDate.of(2023, 03, 20));
		bevarageDTO.setPrice(35);
		bevarageDTO.setMilkContentInGm(2.5);
		bevarageDTO.setSugarContentInGm(3.6);
		bevarageDTO.setAvalaibleIn(250);
		ref.addAttribute("coldDrink", bevarageDTO);
		return "index.jsp";
	}
	
	@GetMapping("/chat")
	public String getChat(Model ref) {
		System.out.println("Runnning getChat...");
		ChatDTO chatDTO = new ChatDTO();
		chatDTO.setChatShopName("Bangarpete chat shop");
		chatDTO.setChatName("Panipuri");
		chatDTO.setNoOfPiece(6);
		chatDTO.setIngredient1("Puri");
		chatDTO.setIngredient2("Aloo");
		chatDTO.setIngredient3("Sweet");
		chatDTO.setIngredient4("khara");
		chatDTO.setIngredient5("Chat masala");
		chatDTO.setIngredient6("Garam masala");
		chatDTO.setIngredient7("Pani");
		chatDTO.setPrice(35);
		ref.addAttribute("chat", chatDTO);
		return "index.jsp";
	}
}
