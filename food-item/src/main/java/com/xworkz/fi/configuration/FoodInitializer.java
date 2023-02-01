package com.xworkz.fi.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FoodInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public FoodInitializer() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] ref = { FoodConfiguration.class };
		System.out.println("Running getServletConfigClasses");
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		String[] ref = { "/" };
		System.out.println("Running getServletMappings");
		return ref;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling...");
	}

}
