package com.xworkz.Cosmeticapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name="laptop_details")
public class LaptopDTO {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name = "laptop_name")
	private String laptop_name;
	
	@Column(name="ram")
	private String ram;
	
	@Column(name="price")
	private double price;
	
	@Column(name="color")
	private String color;

}
