package com.example.demoedureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoEdurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEdurekaApplication.class, args);
	}

}
