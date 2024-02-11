package com.ufapeSports.ufapeSports.service;

import java.util.List;

import com.ufapeSports.ufapeSports.model.entity.Endereco;

public interface EnderecoService {
    Endereco findEnderecoById(Long enderecoID);

    Endereco findEnderecoByCep(String cep);

    List<Endereco> findEnderecosByCidade(String cidade);

    List<Endereco> findEnderecosByEstado(String estado);

    List<Endereco> findEnderecosByLogradouro(String logradouro);

    List<Endereco> findEnderecosByBairro(String bairro);

    Endereco saveEndereco(Endereco endereco);

    Endereco updateEndereco(Endereco endereco);

    void deleteEnderecoById(Long enderecoID);

    long countEnderecos();
}
