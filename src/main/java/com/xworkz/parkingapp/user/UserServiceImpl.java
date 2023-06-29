package com.xworkz.parkingapp.user;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo repo;

	public UserServiceImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(@Valid UserDTO dto) {
			
		System.out.println("running validateAndSave");
		
		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(dto, entity);
		System.out.println(entity);
		repo.saveInfo(entity);
		return true;
		
	}


}
