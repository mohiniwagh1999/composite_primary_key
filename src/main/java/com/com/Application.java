package com.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.com.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(Application.class, args);
		PersonService ps=c.getBean(PersonService.class);
		//ps.savePerson();
		ps.getPerson();
		
	}

}
