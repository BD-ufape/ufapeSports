package com.ufapeSports.ufapeSports.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufapeSports.ufapeSports.model.entity.Endereco;
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
	
	@Override
    public Endereco findEnderecoById(Long enderecoID) {
        return repository.findByEnderecoID(enderecoID);
    }

    @Override
    public Endereco findEnderecoByCep(String cep) {
        return repository.findByCep(cep);
    }

    @Override
    public List<Endereco> findEnderecosByCidade(String cidade) {
        return repository.findByCidade(cidade);
    }

    @Override
    public List<Endereco> findEnderecosByEstado(String estado) {
        return repository.findByEstado(estado);
    }

    @Override
    public List<Endereco> findEnderecosByLogradouro(String logradouro) {
        return repository.findByLogradouro(logradouro);
    }

    @Override
    public List<Endereco> findEnderecosByBairro(String bairro) {
        return repository.findByBairro(bairro);
    }

    @Override
    public Endereco saveEndereco(Endereco endereco) {
        return repository.save(endereco);
    }

    @Override
    public Endereco updateEndereco(Endereco endereco) {
        return repository.save(endereco);
    }

    @Override
    public void deleteEnderecoById(Long enderecoID) {
    	repository.deleteByEnderecoID(enderecoID);
    }

    @Override
    public long countEnderecos() {
        return repository.count();
    }
}
