<<<<<<< HEAD
package com.xworkz.parkingapp.service;

import java.util.List;

import com.xworkz.parkingapp.dto.ParkingInfoDTO;
import com.xworkz.parkingapp.entity.ParkingInfoEntity;

public interface ParkingInfoService {
	
	boolean validateAndSave(ParkingInfoDTO dto);

	List<ParkingInfoDTO> findByLocation(String location);

	ParkingInfoEntity findByAll(String location, String vtype, String vclassification, String term);

}
=======
package com.xworkz.parkingapp.service;

import java.util.List;

import com.xworkz.parkingapp.dto.ParkingInfoDTO;

public interface ParkingInfoService {
	
	boolean validateAndSave(ParkingInfoDTO dto);

	List<ParkingInfoDTO> findByLocation(String location);

}
>>>>>>> 90f3ecdb2433f231ce736432d86cf560e92bf14c
