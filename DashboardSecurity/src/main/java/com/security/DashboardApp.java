package com.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAutoConfiguration
@SpringBootApplication
public class DashboardApp {

	public static void main(String[] args) {
		SpringApplication.run(DashboardApp.class, args);
	}
}
