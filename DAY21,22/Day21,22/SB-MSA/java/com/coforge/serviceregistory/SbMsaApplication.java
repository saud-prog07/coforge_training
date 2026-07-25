package com.coforge.serviceregistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbMsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMsaApplication.class, args);
	}

}
