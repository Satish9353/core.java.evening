package com.xworkz.contactapp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.contactapp.Constant;
import com.xworkz.contactapp.dto.ContactDTO;
import com.xworkz.contactapp.service.ContactService;
import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@Slf4j
public class ContactController {
	
	@Autowired
	ContactService service ;
	public Set<ContactDTO> dtos = new TreeSet<>();

	
	public ContactController() {
		log.info("created BloodDonationController");
	}
	
	@PostMapping("/contact")
	public String onContact(@Valid ContactDTO dto,BindingResult bindingResult,Model model, MultipartFile file ) throws IOException {
		
		log.info("running on contact");
		
		model.addAttribute("dtos",dto);
		if(bindingResult.hasErrors()) {
			log.info("Data is invalide");
			
			List<ObjectError> errors = bindingResult.getAllErrors(); 
			errors.forEach(ob->System.err.println(ob.getDefaultMessage()));
			model.addAttribute("error",errors);
			model.addAttribute("errors",bindingResult.getAllErrors());
			model.addAttribute("dto",dto);
			return "/index.jsp";
		}else {
			log.info("data is valid");
			log.info("asd", file);
			//model.addAttribute("sucessMsg","blood group of"+   dto.getName  ()+"saved sucessfully...");
			log.info("File received:" + file.getName());
			log.info("File size:" + file.getSize());
			log.info("File Type:" + file.getContentType());
			log.info("file bytes:"+ file.getBytes());
			
			File files = new File("C:\\Users\\satis\\Desktop\\"+ file.getOriginalFilename());
			
			try (OutputStream os = new FileOutputStream(files)){
				os.write(file.getBytes());
			}
			
			dto.setFileName(System.currentTimeMillis() + "_" + file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			dto.setFileSize(file.getSize());
			dto.setFiles(dto.getFileName().substring(14));
			
			/*------------------------------------------------------------------------------*/
			service.validateAndSave(dto);
			log.info("abc", dto);
			
			this.dtos.add(dto);
			System.out.println("dto added to set , with total" + this.dtos.size());
			model.addAttribute("msg","contact application  of " + dto.getName()+ " is done" );
		}
		return "/index.jsp";	
	}
	@GetMapping("/filedownload")
	public void sendImage(String fileName,String contentType,HttpServletResponse response) throws IOException {
		log.info("running upload image...");
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
		log.info("running showdata");
		System.out.println(this.dtos);
		model.addAttribute("dtos",this.dtos);
		return "/table.jsp";
	}

}