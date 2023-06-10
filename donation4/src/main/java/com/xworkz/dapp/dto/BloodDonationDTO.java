package com.xworkz.dapp.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BloodDonationDTO implements Serializable,Comparable<BloodDonationDTO>{
	
	@Size(min=3 , max=30,message="person name should be between 3 and 30")
	private String name;
	
	@NotEmpty
	@Size(min =3,max=30,message="address should  be between 3 and 30")
	private String address;
	
	@Min(value = 18,message="age should be greater then or equal to 18")
	@Max(value= 60,message="age should be less then 60")
	private int age;
	
	@NotEmpty(message="Group must be selected")
	private String bloodGroup;
	
	@Min(value=50,message="weight should be more than 50")
	private int weight;
	
	
	private String fileName;
	
	private String contentType;
	
	private long fileSize;

	@Override
	public int compareTo(BloodDonationDTO o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}

}
