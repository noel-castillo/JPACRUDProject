package com.skilldistillery.mlbb.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.skilldistillery.jpamlbb")
public class BootMvcVideoStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcVideoStoreApplication.class, args);
	}

}
