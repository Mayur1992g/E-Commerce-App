package com.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ecom.*"})
public class EComApplication {

	public static void main(String[] args) {
		SpringApplication.run(EComApplication.class, args);
	}

}
