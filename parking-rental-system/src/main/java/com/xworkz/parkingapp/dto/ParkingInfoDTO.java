package com.xworkz.parkingapp.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="mvc.info_table")
public class ParkingInfoDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String location;
	
	private String vtype;
	
	private String vclassification;
	
	private String term;
	
	private int price;
	
	private String discount;

}
