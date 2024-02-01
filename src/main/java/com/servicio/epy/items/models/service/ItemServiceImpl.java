package com.servicio.epy.items.models.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.servicio.epy.items.models.Items;
import com.servicio.epy.items.models.Producto;


@Service
public class ItemServiceImpl  implements ItemService{

	
	//Como lo tenemos registrado lo podemos inyectar
	@Autowired
	private RestTemplate clienteRest;
	
	
	@Override
	public List<Items> findAll() {
		List<Producto> productos= Arrays.asList(
				clienteRest.getForObject("http://localhost:9001/productos/listar",
				Producto[].class));	
		return productos.stream().map(  p-> new Items(p, 1)  ).collect(Collectors.toList());
	}

	@Override
	public Items findById(Long id) {
		
		return null;
	}
	
	

}
