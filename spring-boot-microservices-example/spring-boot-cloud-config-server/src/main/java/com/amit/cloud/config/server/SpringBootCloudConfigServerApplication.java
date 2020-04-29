package com.amit.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
*
* @author Amit Patil
*
**/
@SpringBootApplication
@EnableConfigServer
public class SpringBootCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudConfigServerApplication.class, args);
	}

}
