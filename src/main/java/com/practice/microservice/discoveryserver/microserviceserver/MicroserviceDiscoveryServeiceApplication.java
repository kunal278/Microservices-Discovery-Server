package com.practice.microservice.discoveryserver.microserviceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryServeiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoveryServeiceApplication.class, args);
	}

}
