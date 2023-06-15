package com.xworkz.contactapp.repo;

import com.xworkz.contactapp.dto.ContactDTO;
import com.xworkz.contactapp.entity.ContactEntity;

public interface ContactRepo {
		
	public ContactDTO save(ContactEntity entity);
}
