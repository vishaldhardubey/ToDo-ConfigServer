package com.bridgeit.todoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * <b>Configutation for config server</b>
 * </p>
 * 
 * @author : Vishal Dhar Dubey
 * @version : 1.0
 * @since : 09-08-2018
 */
@RestController
@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigserverApplication {

	/**
	 * <p>
	 * main function is to start the config server
	 * </p>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}

	@RequestMapping("/hello")
	public String getHello() {

		return "vishal";
	}

}
