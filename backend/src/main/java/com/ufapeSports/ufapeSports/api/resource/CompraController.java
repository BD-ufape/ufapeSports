package com.ufapeSports.ufapeSports.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ufapeSports.ufapeSports.model.entity.Compra;
import com.ufapeSports.ufapeSports.model.entity.Cliente;
import com.ufapeSports.ufapeSports.service.CompraService;

import java.util.List;

@RestController
@RequestMapping("/api/compras")
public class CompraController {
	
	private final CompraService service;

	@Autowired
	public CompraController(CompraService service) {
		this.service = service;
	}
	
	@GetMapping("/buscarCompra")
	public ResponseEntity<Compra> buscarCompraPorId(@PathVariable Long id) {
		Compra compra = service.findCompraById(id);
		if (compra != null) {
			return ResponseEntity.ok(compra);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/salvar")
	public ResponseEntity<Compra> salvarCompra(@RequestBody Compra compra) {
		Compra novaCompra = service.saveCompra(compra);
		return new ResponseEntity<>(novaCompra, HttpStatus.CREATED);
	}

	@GetMapping("/cliente/{clienteId}")
	public ResponseEntity<List<Compra>> buscarComprasPorClienteId(@PathVariable Long clienteId) {
		List<Compra> compras = service.findComprasByCliente(clienteId);
		if (compras != null && !compras.isEmpty()) {
			return ResponseEntity.ok(compras);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
