<<<<<<< HEAD
package com.xworkz.parkingapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "parking_info")
@NamedQueries({
		@NamedQuery(name = "findByLoaction", query = "select entity from ParkingInfoEntity as entity where entity.location=:ab"),
		@NamedQuery(name = "findByAll", query = "select entity from ParkingInfoEntity"
				+ " entity where entity.location=:loc and entity.vtype=:vt and entity.vclassification=:vc and entity.term=:t" ) })
public class ParkingInfoEntity {

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
=======
package com.xworkz.parkingapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="parking_info")
@NamedQuery(name="findByLoaction",query="select entity from ParkingInfoEntity as entity where entity.location=:ab")
public class ParkingInfoEntity {
	
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
>>>>>>> 90f3ecdb2433f231ce736432d86cf560e92bf14c
