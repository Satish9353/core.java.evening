package com.xworkz.parkingapp.controller;

import java.util.Set;
import java.util.TreeSet;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import com.xworkz.parkingapp.dto.ParkingInfoDTO;
import com.xworkz.parkingapp.service.ParkingInfoService;
@Controller
public class ParkingInfoController {

	@Autowired
	ParkingInfoService service;
	//public Set<ParkingInfoDTO> dtos = new TreeSet<>();

	public ParkingInfoController() {
		
		System.out.println("created" + this.getClass().getSimpleName());
		
	}
	
	@PostMapping("savePI")
	public String OnSave(@Valid ParkingInfoDTO dto,Model model,BindingResult bindingResult) {
		System.out.println("inside onSave method");
		model.addAttribute("dtos",dto);
		
		if(bindingResult.hasErrors()) {
			System.out.println("data is invalide");
			model.addAttribute("erros",bindingResult.getAllErrors());
			model.addAttribute("dto",dto);

			return "/information.jsp";
		}else {
			System.out.println("data is valid");
			service.validateAndSave(dto);
			//this.dtos.add(dto);
			model.addAttribute("msg","ParkingInfo saved successfully");
		}
		return "/response.jsp";
		
		
	}

}
