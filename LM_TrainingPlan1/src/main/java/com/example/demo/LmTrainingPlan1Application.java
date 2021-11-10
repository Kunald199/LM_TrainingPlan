package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LmTrainingPlan1Application {

	public static void main(String[] args) {
		//configurable app context returns object at runtime execution
		ConfigurableApplicationContext context=SpringApplication.run(LmTrainingPlan1Application.class, args);
		Customer c = context.getBean(Customer.class);  //compiler check if there is customer bean available
		c.display();
	}

}
