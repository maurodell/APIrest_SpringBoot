package com.practica.practica2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(scanBasePackages={"com.example.something", "com.example.application"})
@SpringBootApplication
//@ComponentScan({"com.practica.practica2.service", "com.practica.practica2.configuration"})
public class Practica2Application {

	public static void main(String[] args) {
		SpringApplication.run(Practica2Application.class, args);
	}

}
