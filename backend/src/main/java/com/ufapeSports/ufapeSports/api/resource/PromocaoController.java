package com.ufapeSports.ufapeSports.api.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufapeSports.ufapeSports.service.PromocaoService;

@RestController
@RequestMapping("/api/promocoes")
public class PromocaoController {
	
	private PromocaoService service;

	public PromocaoController(PromocaoService service) {
		this.service = service;
	}
	
	
}
