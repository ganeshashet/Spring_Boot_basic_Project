package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		ApplicationContext con= SpringApplication.run(HelloSpringApplication.class, args);
		//programmer pro= new programmer();
		//pro.display();
		programmer pro1=con.getBean(programmer.class);
		pro1.display();
	}

	
}
