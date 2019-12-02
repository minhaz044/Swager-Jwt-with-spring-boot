package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class SwagerDummyApplication {
	public static void main(String[] args) {
		SpringApplication.run(SwagerDummyApplication.class, args);
	}
}
