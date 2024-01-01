package com.abbasi.springThymeleaf;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringThymeleafApplication implements CommandLineRunner, WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(SpringThymeleafApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("test");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("file:src/main/resources/templates/");
	}
}
