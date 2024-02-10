package com.ufapeSports.ufapeSports.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufapeSports.ufapeSports.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
}
