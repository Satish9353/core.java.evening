package com.xworkz.contactapp.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.contactapp.Constant;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class ContactWebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("created"+ this.getClass().getSimpleName());
		return  null;   /* new Class[] {DonationConfig.class} */
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("getServletConfigClasse");
		return new Class[] {ContactConfig.class};		

	}

	@Override
	protected String[] getServletMappings() {
		log.info("getServletMappings");		
	return new String[] {"/"};
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize = /*800000000 */Constant.MAX_FILE_SIZE;
		MultipartConfigElement configElement = new MultipartConfigElement(Constant.TEMP_FILE_LOCATION,maxSize,maxSize*2,maxSize/2);
		registration.setMultipartConfig(configElement);
	}
	
}
