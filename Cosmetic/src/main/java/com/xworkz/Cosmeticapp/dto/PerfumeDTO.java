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
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="perfume_details")
public class PerfumeDTO {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="perfume_name")
	private String perfume_name;
	
	@Column(name="perfume_type")
	private String perfume_type;
	
	@Column(name="mfg_date")
	private String mfg_date;
	
	@Column(name="exp_date")
	private String exp_date;
	
	@Column(name="price")
	private double price;

}
