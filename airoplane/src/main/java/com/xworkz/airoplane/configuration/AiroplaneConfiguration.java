package com.xworkz.airoplane.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz.airoplane")
public class AiroplaneConfiguration {

	public AiroplaneConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver resolver() {
		return new InternalResourceViewResolver("/", ".jsp");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		return new LocalContainerEntityManagerFactoryBean();
	}
}
