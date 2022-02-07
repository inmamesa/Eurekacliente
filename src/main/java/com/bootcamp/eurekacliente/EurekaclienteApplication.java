package com.bootcamp.eurekacliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaclienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclienteApplication.class, args);
	}

}
