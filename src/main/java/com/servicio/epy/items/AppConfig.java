package com.servicio.epy.items;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	
	//el objeto que retorna se guarda
	// en el contenedor
	@Bean("clienteRest")
	public RestTemplate registrarTemplate() {
		return new RestTemplate();
		
	}

}
