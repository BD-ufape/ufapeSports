package com.ufapeSports.ufapeSports.service;

import java.util.List;

import com.ufapeSports.ufapeSports.model.entity.Cliente;

public interface ClienteService {
    Cliente findClienteById(Long clienteID);

    Cliente findClienteByCpf(String cpf);

    List<Cliente> findClientesByNome(String nome);

    List<Cliente> findClientesByTelefone(String telefone);

    Cliente findClienteByEmail(String email);

    Cliente saveCliente(Cliente cliente);

    Cliente updateCliente(Cliente cliente);

    void deleteClienteById(Long clienteID);

    long countClientes();
}
