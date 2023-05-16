package com.xworkz.lapapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LaptopDTO {
	
	private int id;
	private String name;
	private String color;
	private String ram;

	
}