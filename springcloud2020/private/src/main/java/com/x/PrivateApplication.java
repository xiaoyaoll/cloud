package com.x;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PrivateApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrivateApplication.class, args);
	}

}
