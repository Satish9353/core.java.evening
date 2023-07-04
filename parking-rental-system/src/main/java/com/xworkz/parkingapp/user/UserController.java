package com.xworkz.parkingapp.user;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	
//	@Autowired
//	private UserParkingService parkingService;
	
	public UserController() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@PostMapping("/userSave")
	public String userParkSave(@Valid UserDTO dto,@Valid UserParkingDTO dtos,BindingResult bindingResult ,Model model) {
		System.out.println("running userParkSave");
		
		if(bindingResult.hasFieldErrors()) {
		model.addAttribute("errors",bindingResult.getAllErrors());
		model.addAttribute("dto",dto);
		return "/userinfo.jsp";
	}
	else {
		System.out.println("data is valid");
		service.validateAndSave(dto,dtos);
		//parkingService.validateAndSave(dtos);
		model.addAttribute("msg","userinfo saved successfully");
	}
		return "/responseuser.jsp";
	}	

}
