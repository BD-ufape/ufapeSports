package com.ufapeSports.ufapeSports.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufapeSports.ufapeSports.model.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	
    Endereco findByEnderecoID(Long enderecoID);

    Endereco findByCep(String cep);

    List<Endereco> findByCidade(String cidade);

    List<Endereco> findByEstado(String estado);

    List<Endereco> findByLogradouro(String logradouro);

    List<Endereco> findByBairro(String bairro);

    void deleteByEnderecoID(Long enderecoID);

    long count();
}
