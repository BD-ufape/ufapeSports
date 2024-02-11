package com.ufapeSports.ufapeSports.api.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufapeSports.ufapeSports.service.CompraService;

@RestController
@RequestMapping("/api/compras")
public class CompraController {
	
	private CompraService service;

	public CompraController(CompraService service) {
		this.service = service;
	}
	
	
}
