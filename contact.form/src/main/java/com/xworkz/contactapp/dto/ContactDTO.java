package com.xworkz.contactapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;


import lombok.Data;

@Data

public class ContactDTO implements Serializable,Comparable<ContactDTO>{
	
	@Size(min=3, max=15 ,message="name must and should be greater then 3 and less then 15")
	
	private String name;
	
	
	private String email;
	
	private long mobile_No;
	
	@Size(min=5, max=200 ,message="comments must and should be min 100 and max 200")
	private String comments;
	
	
	private String fileName;
	
	private String contentType;
	
	private long fileSize;
	
	private String files;
	
	public int compareTo(ContactDTO o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}
}
