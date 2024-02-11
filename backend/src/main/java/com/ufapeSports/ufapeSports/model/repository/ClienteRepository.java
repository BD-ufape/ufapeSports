package com.ufapeSports.ufapeSports.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufapeSports.ufapeSports.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    Cliente findByClienteID(Long clienteID);

    Cliente findByCpf(String cpf);

    List<Cliente> findByNomeContaining(String nome);

    List<Cliente> findByTelefone(String telefone);

    Cliente findByEmail(String email);

    void deleteByClienteID(Long clienteID);

    long count();
}
