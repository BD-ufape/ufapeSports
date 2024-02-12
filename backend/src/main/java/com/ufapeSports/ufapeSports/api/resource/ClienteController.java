package com.ufapeSports.ufapeSports.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ufapeSports.ufapeSports.model.entity.Cliente;
import com.ufapeSports.ufapeSports.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable("id") Long clienteId) {
        Cliente cliente = clienteService.findClienteById(clienteId);
        return ResponseEntity.ok(cliente);
    }

    @PostMapping("/salvar")
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente savedCliente = clienteService.saveCliente(cliente);
        return new ResponseEntity<>(savedCliente, HttpStatus.CREATED);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable("id") Long clienteId, @RequestBody Cliente clienteDetails) {
        Cliente cliente = clienteService.findClienteById(clienteId);
        if (cliente == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        cliente.setNome(clienteDetails.getNome());
        cliente.setCpf(clienteDetails.getCpf());
        cliente.setTelefone(clienteDetails.getTelefone());
        cliente.setEmail(clienteDetails.getEmail());
        cliente.setEndereco(clienteDetails.getEndereco());
        Cliente updatedCliente = clienteService.updateCliente(cliente);
        return ResponseEntity.ok(updatedCliente);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable("id") Long clienteId) {
        Cliente cliente = clienteService.findClienteById(clienteId);
        if (cliente == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        clienteService.deleteClienteById(clienteId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> countClientes() {
        long count = clienteService.countClientes();
        return ResponseEntity.ok(count);
    }
}
