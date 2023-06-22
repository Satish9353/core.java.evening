package com.xworkz.parkingapp.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parkingapp.dto.ParkingInfoDTO;
import com.xworkz.parkingapp.entity.ParkingInfoEntity;
import com.xworkz.parkingapp.repo.ParkingInfoRepo;
@Service
public class ParkingInfoServiceImpl implements ParkingInfoService{

	@Autowired
	ParkingInfoRepo repo;
	
	@Override
	public boolean validateAndSave(ParkingInfoDTO dto) {
		
		ParkingInfoEntity entity = new ParkingInfoEntity();
		BeanUtils.copyProperties(dto, entity);
		repo.saveInfo(entity);
		return true;
	}

}
