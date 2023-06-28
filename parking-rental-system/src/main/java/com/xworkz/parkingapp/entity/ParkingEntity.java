package com.xworkz.parkingapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "parking_details")
@NamedQuery(name = "findByEmail", query = "select ent from ParkingEntity ent where ent.email=:ess")
public class ParkingEntity {
	@Id
	private int id;

	@Size(min = 3, max = 30, message = "name must and should be greater then 3 and less then 30")
	private String adminName;

	private String email;

	private String password;

	private String loginTime;

	private String createdTime;

	private String createdBy;

	private String updatedBy;

	private String updatedTime;

	
}
