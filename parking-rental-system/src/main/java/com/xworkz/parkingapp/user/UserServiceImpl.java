package com.xworkz.parkingapp.user;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo repo;
	
	@Autowired
	private UserParkingRepo repopark;

	public UserServiceImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(@Valid UserDTO dto, @Valid UserParkingDTO dtos) {
			
		System.out.println("running validateAndSave");	
		UserEntity record=repo.findByUserEmail(dto.getUserEmail());
		if(record==null) {
		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(dto, entity);
		System.out.println(entity);
		boolean saveInfo = repo.saveInfo(entity);
		if(entity!=null) {
		
			
			UserParkingEntity entity1= new UserParkingEntity();
			
		//	System.out.println("the current user id" +entity.getUserId());
			UserEntity userByEmail=repo.findByUserEmail(dto.getUserEmail());
			dtos.setUserId(userByEmail.getUserId());
			BeanUtils.copyProperties(dtos, entity1);
			System.out.println(entity1);
			repopark.saveparkingInfo(entity1);
			return true;
		}
		}
	return true;
	
	}


}
