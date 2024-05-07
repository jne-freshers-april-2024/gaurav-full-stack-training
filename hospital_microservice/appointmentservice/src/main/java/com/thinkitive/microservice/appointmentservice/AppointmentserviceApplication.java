package com.thinkitive.microservice.appointmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppointmentserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentserviceApplication.class, args);
	}

}