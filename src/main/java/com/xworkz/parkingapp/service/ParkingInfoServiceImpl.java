package com.xworkz.parkingapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parkingapp.dto.ParkingInfoDTO;
import com.xworkz.parkingapp.entity.ParkingInfoEntity;
import com.xworkz.parkingapp.repo.ParkingInfoRepo;

@Service
public class ParkingInfoServiceImpl implements ParkingInfoService {

	@Autowired
	ParkingInfoRepo repo;

	@Override
	public boolean validateAndSave(ParkingInfoDTO dto) {

		ParkingInfoEntity entity = new ParkingInfoEntity();
		BeanUtils.copyProperties(dto, entity);
		repo.saveInfo(entity);
		return true;
	}

	@Override
	public List<ParkingInfoDTO> findByLocation(String location) {
		System.out.println("running findByLocation");

		List<ParkingInfoEntity> entities = this.repo.findByLocation(location);

		List<ParkingInfoDTO> dtos = entities.stream().map(ent -> {
			ParkingInfoDTO dto = new ParkingInfoDTO();
			BeanUtils.copyProperties(ent, dto);
			return dto;
		}).collect(Collectors.toList());

		return dtos;
	}

	@Override
	public ParkingInfoEntity findByAll(String location, String vtype, String vclassification, String term) {
		System.out.println("running findByAll method");
		ParkingInfoEntity entity = repo.findByAll(location, vtype, vclassification, term);
		System.out.println("entity : "+entity);
		return entity;
	}
}
