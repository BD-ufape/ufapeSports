package com.ufapeSports.ufapeSports.model.repository;

import com.ufapeSports.ufapeSports.model.entity.Promocao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PromocaoRepository extends JpaRepository<Promocao, Long> {
    List<Promocao> findByDataInicioBeforeAndDataFimAfter(LocalDateTime dataInicio, LocalDateTime dataFim);

    List<Promocao> findByDescricaoContainingIgnoreCase(String descricao);
    
    List<Promocao> findByDataInicioBeforeAndDataFimAfterOrDataFimIsNull(LocalDateTime dataAtual, LocalDateTime dataAtual2);

    List<Promocao> findByPorcentagemGreaterThan(float porcentagem);
}
