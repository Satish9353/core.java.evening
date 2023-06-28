package com.xworkz.parkingapp.user;

import javax.validation.Valid;

public interface UserService {

	boolean validateAndSave(@Valid UserDTO dto);

}
