package com.apudasgupta.microservice.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Apu Das Gupta
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class MyMicroserviceDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMicroserviceDiscoveryServerApplication.class, args);
	}

}
