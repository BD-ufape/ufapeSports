package com.ufapeSports.ufapeSports.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufapeSports.ufapeSports.model.entity.Cliente;
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
	
	@Override
    public Cliente findClienteById(Long clienteID) {
        return repository.findByClienteID(clienteID);
    }

    @Override
    public Cliente findClienteByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

    @Override
    public List<Cliente> findClientesByNome(String nome) {
        return repository.findByNomeContaining(nome);
    }

    @Override
    public List<Cliente> findClientesByTelefone(String telefone) {
        return repository.findByTelefone(telefone);
    }

    @Override
    public Cliente findClienteByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public void deleteClienteById(Long clienteID) {
    	repository.deleteByClienteID(clienteID);
    }

    @Override
    public long countClientes() {
        return repository.count();
    }
}
