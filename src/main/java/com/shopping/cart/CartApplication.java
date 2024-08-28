package com.shopping.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CartApplication {
	// New Cart Application
	public static void main(String[] args) {
		System.out.println("First Log");
		SpringApplication.run(CartApplication.class, args);
	}

}
