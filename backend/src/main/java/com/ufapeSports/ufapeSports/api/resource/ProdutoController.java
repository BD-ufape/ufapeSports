package com.ufapeSports.ufapeSports.api.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufapeSports.ufapeSports.model.entity.Produto;
import com.ufapeSports.ufapeSports.service.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	private ProdutoService service;

	public ProdutoController(ProdutoService service) {
		this.service = service;
	}
	
	@GetMapping("/produto/{id}")
    public ResponseEntity<Produto> getProdutoById(@PathVariable("id") Long produtoId) {
        Produto produto = service.findProdutoById(produtoId);
        return ResponseEntity.ok(produto);
    }

    @PostMapping("/salvar")
    public ResponseEntity<Produto> createProduto(@RequestBody Produto produto) {
        Produto savedProduto = service.saveProduto(produto);
        return new ResponseEntity<>(savedProduto, HttpStatus.CREATED);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Produto> updateProduto(@PathVariable("id") Long produtoId, @RequestBody Produto produtoDetails) {
        Produto produto = service.findProdutoById(produtoId);
        if (produto == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        produto.setNome(produtoDetails.getNome());
        produto.setMarca(produtoDetails.getMarca());
        produto.setPreco(produtoDetails.getPreco());
        produto.setEstoque(produtoDetails.getEstoque());
        produto.setDescricao(produtoDetails.getDescricao());
        produto.setPeso(produtoDetails.getPeso());
        produto.setCor(produtoDetails.getCor());
        Produto updatedProduto = service.updateProduto(produto);
        return ResponseEntity.ok(updatedProduto);
    }

    @DeleteMapping("/deletar")
    public ResponseEntity<Void> deleteProduto(@PathVariable("id") Long produtoId) {
        Produto produto = service.findProdutoById(produtoId);
        if (produto == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        service.deleteProdutoById(produtoId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> countProdutos() {
        long count = service.countProdutos();
        return ResponseEntity.ok(count);
    }
}
