package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.controller"})
@ComponentScan("com.example.demo.repository")
@ComponentScan("com.example.demo.service")

public class PlacementManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacementManagementSystemApplication.class, args);
	}

}
