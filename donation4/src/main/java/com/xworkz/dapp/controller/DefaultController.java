package com.xworkz.dapp.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dapp.dto.BloodDonationDTO;

@Component
@RequestMapping("/")
public class DefaultController {
	
	public DefaultController() {
		System.out.println("created"+ this.getClass().getSimpleName());
		
	}
	@RequestMapping("/start")
	public String onStart(Model model) {
		model.addAttribute("dto",new BloodDonationDTO());
		return "/index.jsp";
		
	}

}
