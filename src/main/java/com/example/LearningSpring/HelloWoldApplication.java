package com.example.LearningSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWoldApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HelloWoldApplication.class, args);
	}

}
