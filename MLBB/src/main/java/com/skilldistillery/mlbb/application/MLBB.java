package com.skilldistillery.mlbb.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.skilldistillery.mlbb")
@ComponentScan("com.skilldistillery.mlbb")
public class MLBB{

	public static void main(String[] args) {
		SpringApplication.run(MLBB.class, args);
	}

}
