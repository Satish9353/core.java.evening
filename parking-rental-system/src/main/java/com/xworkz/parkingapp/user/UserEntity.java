package com.xworkz.parkingapp.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="userInfo_details")
@NamedQuery(name = "findByUserEmail", query = "select entity from UserEntity as entity where entity.userEmail=:email")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	private String userName;
	
	private String userEmail;
	
	private long userMobileNo;

}