package com.servicio.epy.items.models.service;

import java.util.List;

import com.servicio.epy.items.models.Items;

public interface ItemService {
	
	public List<Items> findAll();
	public Items findById(Long id, Integer cantidad);

}
