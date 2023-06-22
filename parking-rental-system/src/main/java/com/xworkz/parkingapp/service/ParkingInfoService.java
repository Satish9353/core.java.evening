package com.xworkz.parkingapp.service;

import com.xworkz.parkingapp.dto.ParkingInfoDTO;

public interface ParkingInfoService {
	
	boolean validateAndSave(ParkingInfoDTO dto);

}
