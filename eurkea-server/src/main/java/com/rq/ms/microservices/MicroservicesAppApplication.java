package com.rq.ms.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroservicesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesAppApplication.class, args);
	}

}
