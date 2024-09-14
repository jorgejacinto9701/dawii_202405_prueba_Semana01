package com.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestamo.entity.Ubigeo;
import com.prestamo.service.UbigeoService;

@RestController
@RequestMapping("/url/ubigeo")
public class UbigeoController {

	@Autowired
	private UbigeoService ubigeoService;
	
	@GetMapping("/listar")
	public List<Ubigeo> listar() {
		return ubigeoService.findAll();
	}
}
