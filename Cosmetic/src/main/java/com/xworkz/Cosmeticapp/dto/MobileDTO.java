package com.xworkz.Cosmeticapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
@Table(name="mobile_details")
public class MobileDTO {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="mobile_name")
	private String mobile_name;
	
	@Column(name="ram")
	private String ram;
	
	@Column(name="rom")
	private String rom;
	
	@Column(name="price")
	private double price;

}
