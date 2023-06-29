<<<<<<< HEAD
package com.xworkz.parkingapp.repo;

import java.util.List;

import com.xworkz.parkingapp.entity.ParkingInfoEntity;

public interface ParkingInfoRepo {

	boolean saveInfo(ParkingInfoEntity entity);


	List<ParkingInfoEntity> findByLocation(String location);


	ParkingInfoEntity findByAll(String location, String vtype, String vclassification, String term);

	
	

}
=======
package com.xworkz.parkingapp.repo;

import java.util.List;

import com.xworkz.parkingapp.entity.ParkingInfoEntity;

public interface ParkingInfoRepo {

	boolean saveInfo(ParkingInfoEntity entity);


	List<ParkingInfoEntity> findByLocation(String location);

	
	

}
>>>>>>> 90f3ecdb2433f231ce736432d86cf560e92bf14c
