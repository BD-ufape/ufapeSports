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
	
	private CompraRepository compraRepository;
	private ClienteRepository clienteRepository;
	
	@Autowired
	public CompraServiceImpl(CompraRepository compraRepository, ClienteRepository clienteRepository) {
		super();
		this.compraRepository = compraRepository;
		this.clienteRepository = clienteRepository;
	}
	
	public Compra findCompraById(Long compraId) {
		return compraRepository.findByCompraId(compraId);
	}

    public Cliente findClienteByCompra(Compra compra) {
    	return compra.getCliente();
    }

    public List<Compra> findComprasByCliente(Cliente cliente) {
    	return cliente.getCompras();
    }
    
    public List<Compra> findComprasByClienteByCpf(String cpf) {
    	return clienteRepository.findByCpf(cpf).getCompras();
    }

    public Compra saveCompra(Compra compra) {
    	return compraRepository.save(compra);
    }
}
