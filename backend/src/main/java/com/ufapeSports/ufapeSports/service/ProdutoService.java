package com.ufapeSports.ufapeSports.service;

import java.util.List;

import com.ufapeSports.ufapeSports.model.entity.Produto;

public interface ProdutoService {
	 Produto findProdutoById(Long produtoID);

	    List<Produto> findProdutosByNome(String nome);

	    List<Produto> findProdutosByMarca(String marca);

	    List<Produto> findProdutosByPrecoBetween(float minPreco, float maxPreco);

	    List<Produto> findProdutosByEstoqueGreaterThan(String quantidade);

	    List<Produto> findProdutosByCor(String cor);
	    
	    List<Produto> findAll();
	    
	    List<Produto> buscarProdutosPorIDs(List<Long> produtoIDs);

	    Produto saveProduto(Produto produto);

	    Produto updateProduto(Produto produto);

	    void deleteProdutoById(Long produtoID);

	    long countProdutos();
}
