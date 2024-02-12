package com.ufapeSports.ufapeSports.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufapeSports.ufapeSports.model.entity.Cliente;
import com.ufapeSports.ufapeSports.model.entity.Compra;
import com.ufapeSports.ufapeSports.model.repository.ClienteRepository;
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
	
	public Compra findCompraById(Long compraId) {
		return repository.findByCompraId(compraId);
	}

    public Cliente findClienteByCompra(Compra compra) {
    	return compra.getCliente();
    }

    public List<Compra> findComprasByCliente(Cliente cliente) {
    	return cliente.getCompras();
    }

    public Compra saveCompra(Compra compra) {
    	return repository.save(compra);
    }
}
