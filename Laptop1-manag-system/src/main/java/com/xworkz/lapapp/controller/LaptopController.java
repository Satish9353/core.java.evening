package com.xworkz.lapapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.xworkz.lapapp.dto.LaptopDTO;
import com.xworkz.lapapp.service.LaptopService;
@RequestMapping("/")
@Controller
//@Component
public class LaptopController {
	
	@Autowired
	LaptopService service;
	
	public LaptopController() {
		System.out.println("LaptopController");
	}
	
	@PostMapping("/registerLaptop")
	public String registerLaptop(@ModelAttribute LaptopDTO dto, HttpServletRequest req) {
		System.out.println("inside registerLaptop ()");
		System.out.println("registering data");
		service.validateAndSave(dto);
		req.setAttribute("nam",dto.getName());
		return "sucess";
	}
	@GetMapping("/listoflaptops")
	public String getLaptop(HttpServletRequest req) {
		System.out.println("inside get method");
		List<LaptopDTO> list=service.validateAndGet();
		req.setAttribute("data",list);
		return "sucess2";
		
	}
	@GetMapping("/searchbyname")
	public  String searchByName(@RequestParam("names") String names,HttpServletRequest req) {
		System.out.println("inside search method");
		List<LaptopDTO> list = service.validateAndSearch(names);
		
		req.setAttribute("data", list);

		return "sucess2";
		
	}
	@GetMapping("/searchbyram")
	public  String searchByRam(@RequestParam("ram") String ram,HttpServletRequest req) {
		System.out.println("inside search method");
		List<LaptopDTO> list = service.validateAndSearch1(ram);
		
		req.setAttribute("data", list);
		
		
		
		return "sucess2";
		
	}
	@GetMapping("/searchbycolor")
	public  String searchByColor(@RequestParam("color") String color,HttpServletRequest req) {
		System.out.println("inside search method");
		List<LaptopDTO> list = service.validateAndSearch2(color);
		
		req.setAttribute("data", list);
		
		
		
		return "sucess2";}
	
	@GetMapping("/update/{id}")
	public  String updateById(@PathVariable("id") int id,HttpServletRequest req) {
		System.out.println("inside search method");
	LaptopDTO dto = service.validateAndUpdate(id);
		
		req.setAttribute("lap", dto);
		RedirectView view = new RedirectView();
		view.setUrl(req.getContextPath()+"/ ");
		return "update";}
	
	
	
	@PostMapping("/save")
	public String updateById1(@ModelAttribute("dto") LaptopDTO dto,HttpServletRequest req) {
		System.out.println("inside search method");
		LaptopDTO dto1 = service.validateAndUpdate1(dto);
			
			req.setAttribute("lap", dto1);
			RedirectView view = new RedirectView();
			view.setUrl(req.getContextPath()+"/ ");
		
		return "sucess3";
		
	}
	
		
}