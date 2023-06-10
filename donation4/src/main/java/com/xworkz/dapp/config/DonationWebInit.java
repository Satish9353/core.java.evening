package com.xworkz.dapp.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.dapp.Constant;

public class DonationWebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created"+ this.getClass().getSimpleName());
		return  null;   /* new Class[] {DonationConfig.class} */
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasse");		
			return new Class[] {DonationConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");		
	return new String[] {"/"};
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize = /*800000000 */Constant.MAX_FILE_SIZE;
		MultipartConfigElement configElement = new MultipartConfigElement(Constant.TEMP_FILE_LOCATION,maxSize,maxSize*2,maxSize/2);
		registration.setMultipartConfig(configElement);
	}
	
	
	
	
	

}
