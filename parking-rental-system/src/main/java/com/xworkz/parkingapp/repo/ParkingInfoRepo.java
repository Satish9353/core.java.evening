package com.xworkz.parkingapp.repo;

import java.util.List;

import com.xworkz.parkingapp.entity.ParkingInfoEntity;

public interface ParkingInfoRepo {

	boolean saveInfo(ParkingInfoEntity entity);


	List<ParkingInfoEntity> findByLocation(String location);

	
	

}
