package com.co.davila.eureka.UltimeSer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UltimeSerApplication {
	public static void main(String[] args) {
		SpringApplication.run(UltimeSerApplication.class, args);
	}
}
