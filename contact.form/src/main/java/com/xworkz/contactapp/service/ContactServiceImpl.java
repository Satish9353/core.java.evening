package com.xworkz.contactapp.service;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.contactapp.dto.ContactDTO;
import com.xworkz.contactapp.entity.ContactEntity;
import com.xworkz.contactapp.repo.ContactRepo;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class ContactServiceImpl implements ContactService {

	
	@Autowired
	private ContactRepo contact;
	@Override 
	 public boolean sendMail(String emailId) {
	 System.out.println("inside send mail");
	 String portNumber = "587";
	 String hostName = "smtp.office365.com";
	 String fromEmail = "bhavanauxworkz@outlook.com";
	 String password = "bhavana@123";
	 String to = emailId;
	 
	  Properties prop = new Properties();
	  prop.put("mail.smtp.host",hostName);
	  prop.put("mail.smtp.port",portNumber);
	  prop.put("mail.smtp.starttls.enable",true);
	  prop.put("mail,smtp,auth",true);
	  prop.put("mail,transport.protocol","smtp");
	  
	  Session session = Session.getDefaultInstance(prop,new Authenticator() {
	  
	  @Override
	  protected PasswordAuthentication getPasswordAuthentication() {
	  return new PasswordAuthentication(fromEmail,password); } });
	  
	  MimeMessage message = new MimeMessage(session);
	  try { message.setFrom(new  InternetAddress(fromEmail));
	  message.setSubject("registration completed");
	  message.setText("thank u for registering");
	  message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	  Transport.send(message);
	  System.out.println("mail sent to "+emailId);}
	 
	  catch(MessagingException e) { e.printStackTrace();
	  }
	  
	  return true; }
	
	@Override
	public boolean validateAndSave(ContactDTO dto) {
		ContactEntity entity = new ContactEntity();
		BeanUtils.copyProperties(dto, entity);
		log.info("       ");
		log.info("Evaluating entity"+ entity);
		contact.save(entity);
		
		ContactService contactService = new ContactServiceImpl();
		
		contactService.sendMail(dto.getEmail());

		return false;
	}

}
