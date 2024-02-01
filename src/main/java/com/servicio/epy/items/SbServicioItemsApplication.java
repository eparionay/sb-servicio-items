package com.servicio.epy.items;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class SbServicioItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbServicioItemsApplication.class, args);
	}

}
