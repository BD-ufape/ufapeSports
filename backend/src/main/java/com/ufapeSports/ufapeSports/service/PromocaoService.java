package com.ufapeSports.ufapeSports.service;

import com.ufapeSports.ufapeSports.model.entity.Promocao;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface PromocaoService {
    Promocao salvarPromocao(Promocao promocao);
    Optional<Promocao> buscarPorId(Long id);
    List<Promocao> buscarPromocoesAtivas(LocalDateTime dataInicio, LocalDateTime dataFim);
    List<Promocao> buscarPorDescricao(String descricao);
    List<Promocao> buscarPromocoesAtivasNaData(LocalDateTime dataAtual);
    List<Promocao> buscarPorPorcentagemMaiorQue(float porcentagem);
    void deletarPromocao(Long id);
	Object listarTodasPromocoes();
}
