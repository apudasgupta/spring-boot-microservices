package com.apudasgupta.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Apu Das Gupta
 *
 */

@SpringBootApplication
@EnableEurekaClient
public class MyMicroservice1Application {

	@LoadBalanced
	public static void main(String[] args) {
		SpringApplication.run(MyMicroservice1Application.class, args);
	}

}
