package com.ufapeSports.ufapeSports.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufapeSports.ufapeSports.model.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    Produto findByProdutoID(Long produtoID);

    List<Produto> findByNomeContaining(String nome);

    List<Produto> findByMarca(String marca);

    List<Produto> findByPrecoBetween(float minPreco, float maxPreco);

    List<Produto> findByEstoqueGreaterThan(String quantidade);

    List<Produto> findByCor(String cor);

    void deleteByProdutoID(Long produtoID);
    
    List<Produto> findAll();
    
    List<Produto> findAllByProdutoIDIn(List<Long> produtoIDs);

    long count();
}
