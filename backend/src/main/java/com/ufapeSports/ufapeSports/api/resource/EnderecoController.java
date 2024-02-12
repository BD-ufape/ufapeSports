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

import com.ufapeSports.ufapeSports.model.entity.Endereco;
import com.ufapeSports.ufapeSports.service.EnderecoService;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController {
	
	private EnderecoService service;

	public EnderecoController(EnderecoService service) {
		this.service = service;
	}
	
	@GetMapping("/endereco/{id}")
    public ResponseEntity<Endereco> getEnderecoById(@PathVariable("id") Long enderecoId) {
        Endereco endereco = service.findEnderecoById(enderecoId);
        return ResponseEntity.ok(endereco);
    }

    @PostMapping("/salvar")
    public ResponseEntity<Endereco> createEndereco(@RequestBody Endereco endereco) {
        Endereco savedEndereco = service.saveEndereco(endereco);
        return new ResponseEntity<>(savedEndereco, HttpStatus.CREATED);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Endereco> updateEndereco(@PathVariable("id") Long enderecoId, @RequestBody Endereco enderecoDetails) {
        Endereco endereco = service.findEnderecoById(enderecoId);
        if (endereco == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        endereco.setCep(enderecoDetails.getCep());
        endereco.setCidade(enderecoDetails.getCidade());
        endereco.setEstado(enderecoDetails.getEstado());
        endereco.setLogradouro(enderecoDetails.getLogradouro());
        endereco.setBairro(enderecoDetails.getBairro());
        Endereco updatedEndereco = service.updateEndereco(endereco);
        return ResponseEntity.ok(updatedEndereco);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deleteEndereco(@PathVariable("id") Long enderecoId) {
        Endereco endereco = service.findEnderecoById(enderecoId);
        if (endereco == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        service.deleteEnderecoById(enderecoId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> countEnderecos() {
        long count = service.countEnderecos();
        return ResponseEntity.ok(count);
    }
}
