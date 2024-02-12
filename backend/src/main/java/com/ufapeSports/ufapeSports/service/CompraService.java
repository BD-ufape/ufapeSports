package com.ufapeSports.ufapeSports.service;

import java.util.List;

import com.ufapeSports.ufapeSports.model.entity.Cliente;
import com.ufapeSports.ufapeSports.model.entity.Compra;

public interface CompraService {
	Compra findCompraById(Long compraId);

    Cliente findClienteByCompra(Compra compra);

    List<Compra> findComprasByCliente(Cliente cliente);
}
