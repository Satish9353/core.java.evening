package com.xworkz.parkingapp.service;

import com.xworkz.parkingapp.dto.ParkingDTO;

public interface ParkingService {
	
	ParkingDTO userSignIn(String email,String password);

}
