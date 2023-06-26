package com.xworkz.parkingapp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parkingapp.dto.ParkingDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultController {
	
	public DefaultController() {
		log.info("inside default controller");
	}
	@RequestMapping("/start")
	public String onStart(Model model) {
		log.info("onstart method started in default controller");
		model.addAttribute("dto",new ParkingDTO());
		log.info("after model attribute");
		return "/home.jsp";
	}
	

}
