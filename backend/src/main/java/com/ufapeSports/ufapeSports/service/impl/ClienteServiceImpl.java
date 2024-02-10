package com.ufapeSports.ufapeSports.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufapeSports.ufapeSports.model.repository.ClienteRepository;
import com.ufapeSports.ufapeSports.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	private ClienteRepository repository;
	
	@Autowired
	public ClienteServiceImpl(ClienteRepository repository) {
		super();
		this.repository = repository;
	}
}
