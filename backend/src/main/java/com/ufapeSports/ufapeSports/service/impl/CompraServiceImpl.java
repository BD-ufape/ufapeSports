package com.ufapeSports.ufapeSports.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufapeSports.ufapeSports.model.repository.CompraRepository;
import com.ufapeSports.ufapeSports.service.CompraService;

@Service
public class CompraServiceImpl implements CompraService{
	
	private CompraRepository repository;
	
	@Autowired
	public CompraServiceImpl(CompraRepository repository) {
		super();
		this.repository = repository;
	}
}
