package com.xworkz.dapp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;


import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.dapp.Constant;
import com.xworkz.dapp.dto.BloodDonationDTO;
@Component
@RequestMapping("/")
public class BloodDonationController {
	
	public Set<BloodDonationDTO> dtos = new TreeSet<>();
	
	public BloodDonationController() {
		System.out.println("created BloodDonationController");
	}
	
	@PostMapping("/donate")
	public String onDonate(@Valid BloodDonationDTO dto,BindingResult bindingResult,Model model, MultipartFile file ) throws IOException {
		
		System.out.println("running on donate");
		
		
		model.addAttribute("dtos",dto);
		if(bindingResult.hasErrors()) {
			System.out.println("Data is invalide");
			
			List<ObjectError> errors = bindingResult.getAllErrors(); 
			errors.forEach(ob->System.err.println(ob.getDefaultMessage()));
			model.addAttribute("error",errors);
			model.addAttribute("errors",bindingResult.getAllErrors());
			model.addAttribute("dto",dto);
			return "/index.jsp";
		}else {
			System.out.println("data is valid");
			System.out.println(file);
			//model.addAttribute("sucessMsg","blood group of"+   dto.getName  ()+"saved sucessfully...");
			System.out.println("File received:" + file.getName());
			System.out.println("File size:" + file.getSize());
			System.out.println("File Type:" + file.getContentType());
			System.out.println("file bytes:"+ file.getBytes());
			
			File files = new File("C:\\Users\\satis\\Desktop//"+ file.getOriginalFilename());
			
			try (OutputStream os = new FileOutputStream(files)){
				os.write(file.getBytes());
			}
			
			dto.setFileName(System.currentTimeMillis() + "_" + file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			dto.setFileSize(file.getSize());
			
			
			this.dtos.add(dto);
			System.out.println("dto added to set , with total" + this.dtos.size());
			model.addAttribute("msg","donation application of" + dto.getName()+ "is done" );
		}
		return "/index.jsp";	
	}
	@GetMapping("/filedownload")
	public void sendImage(String fileName,String contentType,HttpServletResponse response) throws IOException {
		System.out.println("running send image...");
		File file= new File(Constant.FILE_LOCATION + fileName);
		response.setContentType(contentType);
		OutputStream os = response.getOutputStream();
		FileInputStream in = new FileInputStream(file);
		byte[] buffer = new byte[4096];
		int length;
		while((length = in.read(buffer))>0){
			os.write(buffer,0,length);
		}
		in.close();
		os.flush();
	}
	
	@GetMapping("/list")
	public String showData(Model model) {
		System.out.println("running showdata");
		System.out.println(this.dtos);
		model.addAttribute("dtos",this.dtos);
		return "/table.jsp";
	}

}
