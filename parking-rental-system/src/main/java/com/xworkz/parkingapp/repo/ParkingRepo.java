package com.xworkz.parkingapp.repo;

import com.xworkz.parkingapp.entity.ParkingEntity;

public interface ParkingRepo {
	
	ParkingEntity userSingIn(String email);
	
	boolean updateTime(ParkingEntity entity);

}
