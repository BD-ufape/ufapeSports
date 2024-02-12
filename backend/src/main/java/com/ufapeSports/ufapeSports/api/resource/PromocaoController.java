package com.ufapeSports.ufapeSports.api.resource;

import com.ufapeSports.ufapeSports.model.entity.Promocao;
import com.ufapeSports.ufapeSports.service.PromocaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/promocoes")
public class PromocaoController {

    private final PromocaoService promocaoService;

    @Autowired
    public PromocaoController(PromocaoService promocaoService) {
        this.promocaoService = promocaoService;
    }

    @PostMapping("/adicionar")
    public ResponseEntity<Promocao> criarPromocao(@RequestBody Promocao promocao) {
        Promocao novaPromocao = promocaoService.salvarPromocao(promocao);
        return new ResponseEntity<>(novaPromocao, HttpStatus.CREATED);
    }

    @GetMapping("/promocao/{id}")
    public ResponseEntity<Promocao> buscarPorId(@PathVariable Long id) {
        return promocaoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<Object> listarTodas(@RequestParam(required = false) String descricao) {
        if (descricao != null) {
            return ResponseEntity.ok(promocaoService.buscarPorDescricao(descricao));
        } else {
            return ResponseEntity.ok(promocaoService.listarTodasPromocoes());
        }
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletarPromocao(@PathVariable Long id) {
        promocaoService.deletarPromocao(id);
        return ResponseEntity.noContent().build();
    }


}
