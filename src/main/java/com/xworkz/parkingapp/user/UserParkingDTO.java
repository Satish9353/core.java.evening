package com.xworkz.parkingapp.user;

import lombok.Data;

@Data
public class UserParkingDTO {

	private String location;

	private String vtype;

	private String vclassification;

	private String term;

	private int price;

	private String discount;
	
	private int totalAmount;

}
