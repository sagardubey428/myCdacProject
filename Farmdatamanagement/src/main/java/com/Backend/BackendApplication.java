package com.Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class BackendApplication  {

	public static void main(String[] args) {
		
		SpringApplication.run(BackendApplication.class, args);
	}

}
//this class will bootstrap the spring application.You can call start your application just by calling a static run() method.