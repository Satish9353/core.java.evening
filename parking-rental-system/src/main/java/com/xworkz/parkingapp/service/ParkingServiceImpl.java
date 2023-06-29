<<<<<<< HEAD
package com.xworkz.parkingapp.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.parkingapp.dto.ParkingDTO;
import com.xworkz.parkingapp.entity.ParkingEntity;
import com.xworkz.parkingapp.repo.ParkingRepo;

@Service
public class ParkingServiceImpl implements ParkingService {
	@Autowired
	ParkingRepo repo;

	public ParkingServiceImpl() {
		System.out.println("parking service impl");
	}

	@Override
	public ParkingDTO userSignIn(String email, String password) {
		System.out.println(email);
		ParkingEntity entity = repo.userSingIn(email);

		if (entity.getEmail().equals(email) && entity.getPassword().equals(password)) {

			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy,hh:mm");
			String formateDate = dateFormat.format(new Date()).toString();

			entity.setLoginTime(formateDate);
			boolean status = repo.updateTime(entity);
			//ParkingEntity entity2 = repo.userSingIn(email);
			ParkingDTO dto = new ParkingDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return null;

	}
}
=======
package com.xworkz.parkingapp.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parkingapp.dto.ParkingDTO;
import com.xworkz.parkingapp.entity.ParkingEntity;
import com.xworkz.parkingapp.repo.ParkingRepo;

@Service
public class ParkingServiceImpl implements ParkingService {
	@Autowired
	ParkingRepo repo;

	public ParkingServiceImpl() {
		System.out.println("parking service impl");
	}

	@Override
	public ParkingDTO userSignIn(String email, String password) {
		System.out.println(email);
		ParkingEntity entity = repo.userSingIn(email);

		if (entity.getEmail().equals(email) && entity.getPassword().equals(password)) {

			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy,hh:mm");
			String formateDate = dateFormat.format(new Date()).toString();

			entity.setLoginTime(formateDate);
			boolean status = repo.updateTime(entity);
			//ParkingEntity entity2 = repo.userSingIn(email);
			ParkingDTO dto = new ParkingDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return null;

	}
}
>>>>>>> 90f3ecdb2433f231ce736432d86cf560e92bf14c
