package com.xworkz.parkingapp.user;

public interface UserRepo {

	boolean saveInfo(UserEntity entity);
	
	UserEntity findByUserEmail(String userEmail);



}
