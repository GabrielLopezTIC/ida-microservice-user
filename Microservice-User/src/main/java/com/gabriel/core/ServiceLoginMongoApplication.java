package com.gabriel.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ServiceLoginMongoApplication implements CommandLineRunner {
	
	@Autowired
	BCryptPasswordEncoder encode;
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceLoginMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
