package com.xworkz.parkingapp.dto;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ParkingDTO {
	
     private int id;
     @Size(min=3,max=30,message="name must and should be greater then 3 and less then 30")
     private String adminName;
     
     private String email;
     
     @Size(min=6,max=15,message="password must and should be more then 6 and less then 15")
     private String password;
     
     private String loginTime;
     
     private String createdTime;
     
     private String createdBy;
     
     private String updatedBy;
     
     private String updatedTime;

}
