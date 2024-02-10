package com.ufapeSports.ufapeSports.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufapeSports.ufapeSports.model.repository.PromocaoRepository;
import com.ufapeSports.ufapeSports.service.PromocaoService;

@Service
public class PromocaoServiceImpl implements PromocaoService{

	private PromocaoRepository repository;
	
	@Autowired
	public PromocaoServiceImpl(PromocaoRepository repository) {
		super();
		this.repository = repository;
	}
	
	
}
