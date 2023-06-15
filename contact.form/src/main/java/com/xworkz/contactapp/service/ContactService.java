package com.xworkz.contactapp.service;

import com.xworkz.contactapp.dto.ContactDTO;

public interface ContactService {

	boolean validateAndSave(ContactDTO dto);

	boolean sendMail(String emailId);

}
