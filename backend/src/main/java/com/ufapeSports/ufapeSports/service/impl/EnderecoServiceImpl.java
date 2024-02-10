package com.ufapeSports.ufapeSports.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufapeSports.ufapeSports.model.repository.EnderecoRepository;
import com.ufapeSports.ufapeSports.service.EnderecoService;

@Service
public class EnderecoServiceImpl implements EnderecoService{
	
	private EnderecoRepository repository;
	
	@Autowired
	public EnderecoServiceImpl(EnderecoRepository repository) {
		super();
		this.repository = repository;
	}
	
	
}
