package com.ufapeSports.ufapeSports.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufapeSports.ufapeSports.model.entity.Produto;
import com.ufapeSports.ufapeSports.model.repository.ProdutoRepository;
import com.ufapeSports.ufapeSports.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	private ProdutoRepository repository;
	
	@Autowired
	public ProdutoServiceImpl(ProdutoRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
    public Produto findProdutoById(Long produtoID) {
        return repository.findByProdutoID(produtoID);
    }

    @Override
    public List<Produto> findProdutosByNome(String nome) {
        return repository.findByNomeContaining(nome);
    }

    @Override
    public List<Produto> findProdutosByMarca(String marca) {
        return repository.findByMarca(marca);
    }

    @Override
    public List<Produto> findProdutosByPrecoBetween(float minPreco, float maxPreco) {
        return repository.findByPrecoBetween(minPreco, maxPreco);
    }

    @Override
    public List<Produto> findProdutosByEstoqueGreaterThan(String quantidade) {
        return repository.findByEstoqueGreaterThan(quantidade);
    }

    @Override
    public List<Produto> findProdutosByCor(String cor) {
        return repository.findByCor(cor);
    }

    @Override
    public Produto saveProduto(Produto produto) {
        return repository.save(produto);
    }

    @Override
    public Produto updateProduto(Produto produto) {
        return repository.save(produto);
    }

    @Override
    @Transactional
    public void deleteProdutoById(Long produtoID) {
    	repository.deleteByProdutoID(produtoID);
    }

    @Override
    public long countProdutos() {
        return repository.count();
    }
}
