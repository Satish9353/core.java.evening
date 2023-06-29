<<<<<<< HEAD
package com.xworkz.parkingapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;

public class ParkingWebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created"+ this.getClass().getSimpleName());
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("inside getServletConfigClasses");
		return new Class[] {ParkingConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("inside getServletMappings");
		return new String[] {"/"};
	}

}
=======
package com.xworkz.parkingapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;

public class ParkingWebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created"+ this.getClass().getSimpleName());
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("inside getServletConfigClasses");
		return new Class[] {ParkingConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("inside getServletMappings");
		return new String[] {"/"};
	}

}
>>>>>>> 90f3ecdb2433f231ce736432d86cf560e92bf14c
