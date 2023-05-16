package com.xworkz.lapapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@ComponentScan(basePackages = "com.xworkz.lapapp")
@Configuration
public class SpringConfig {
	public SpringConfig() {
		System.out.println("SpringConfig");
	}
	
	@Bean
	public ViewResolver getViewResolver() {
		return new InternalResourceViewResolver("/",".jsp");
	}
}

