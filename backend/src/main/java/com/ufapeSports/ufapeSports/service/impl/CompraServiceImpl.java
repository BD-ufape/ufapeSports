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
	@Override
	public Compra findCompraById(Long compraId) {
		return repository.findByCompraId(compraId);
	}
	@Override
    public Cliente findClienteByCompra(Compra compra) {
    	return compra.getCliente();
    }
    @Override
    public Compra saveCompra(Compra compra) {
    	return repository.save(compra);
    }

	@Override
	public List<Compra> findComprasByCliente(Long clienteId) {
		return repository.findByClienteId(clienteId);
	}
}
