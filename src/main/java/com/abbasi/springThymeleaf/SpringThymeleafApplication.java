package com.abbasi.springThymeleaf;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringThymeleafApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringThymeleafApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("test");
	}
}
