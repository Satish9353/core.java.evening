package com.xworkz.parkingapp.user;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserParkingServiceImpl implements UserParkingService {

	@Autowired
	private UserParkingRepo repo;

	public UserParkingServiceImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(@Valid UserParkingDTO dto) {
			
		System.out.println("running validateAndSave");
		
		UserParkingEntity entity = new UserParkingEntity();
		BeanUtils.copyProperties(dto, entity);
		System.out.println(entity);
		repo.saveInfo(entity);
		return true;
		
	}

}
