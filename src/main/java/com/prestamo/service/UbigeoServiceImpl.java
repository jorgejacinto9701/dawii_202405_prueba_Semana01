package com.prestamo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prestamo.entity.Ubigeo;
import com.prestamo.repository.UbigeoRepository;

@Service
public class UbigeoServiceImpl  implements UbigeoService{

	
	@Autowired
	private UbigeoRepository ubigeoRepository;
	
	@Override
	public List<Ubigeo> findAll() {
		return ubigeoRepository.findAll();
	}

	
}
