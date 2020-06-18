package com.apudasgupta.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Apu Das Gupta
 *
 */

@SpringBootApplication
@EnableEurekaClient
public class MyMicroservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyMicroservice2Application.class, args);
	}

}
