package com.ufapeSports.ufapeSports.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufapeSports.ufapeSports.model.entity.Cliente;
import com.ufapeSports.ufapeSports.model.entity.Compra;

public interface CompraRepository extends JpaRepository<Compra, Long>{
	Compra findByCompraId(Long compraId);

    Cliente findClienteByCompraId(Compra compra);

    List<Compra> findByCliente_ClienteID(Long clienteID);

}
