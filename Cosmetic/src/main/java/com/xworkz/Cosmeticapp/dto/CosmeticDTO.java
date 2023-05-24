package com.xworkz.Cosmeticapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Table(name="cosmetic_table")
public class CosmeticDTO {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="cosmeticName")
	private String cosmeticName;
	
	@Column(name="cosmeticType")
	private String cosmeticType;
	
	@Column(name="price")
	private double price;

}
