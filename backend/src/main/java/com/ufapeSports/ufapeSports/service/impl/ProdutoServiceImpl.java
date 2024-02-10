package com.ufapeSports.ufapeSports.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufapeSports.ufapeSports.model.repository.ProdutoRepository;
import com.ufapeSports.ufapeSports.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	private ProdutoRepository repository;
	
	@Autowired
	public ProdutoServiceImpl(ProdutoRepository repository) {
		super();
		this.repository = repository;
	}
	
	
}
