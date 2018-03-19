package com.learning.spring.boot.manual;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration //This is a spring boot annotation that tells spring to guess our configuration using some clues it gathers
@SpringBootApplication //This Annotation is equivalent to @EnableAutoConfiguration, @Configuration, @ComponentScan
public class Application {
	
	@Value ("${name}")
	private String message;
	
	@RequestMapping ("/")
	public String helloWorld () {
		return message;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
