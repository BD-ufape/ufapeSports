package com.ufapeSports.ufapeSports.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufapeSports.ufapeSports.model.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
}