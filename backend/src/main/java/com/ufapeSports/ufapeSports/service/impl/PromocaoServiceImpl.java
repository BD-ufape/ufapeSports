package com.ufapeSports.ufapeSports.service.impl;

import com.ufapeSports.ufapeSports.model.entity.Promocao;
import com.ufapeSports.ufapeSports.model.repository.PromocaoRepository;
import com.ufapeSports.ufapeSports.service.PromocaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PromocaoServiceImpl implements PromocaoService {

    private final PromocaoRepository promocaoRepository;

    @Autowired
    public PromocaoServiceImpl(PromocaoRepository promocaoRepository) {
        this.promocaoRepository = promocaoRepository;
    }

    @Override
    public Promocao salvarPromocao(Promocao promocao) {
        return promocaoRepository.save(promocao);
    }

    @Override
    public Optional<Promocao> buscarPorId(Long id) {
        return promocaoRepository.findById(id);
    }

    @Override
    public List<Promocao> buscarPromocoesAtivas(LocalDateTime dataInicio, LocalDateTime dataFim) {
        return promocaoRepository.findByDataInicioBeforeAndDataFimAfter(dataInicio, dataFim);
    }

    @Override
    public List<Promocao> buscarPorDescricao(String descricao) {
        return promocaoRepository.findByDescricaoContainingIgnoreCase(descricao);
    }

    @Override
    public List<Promocao> buscarPromocoesAtivasNaData(LocalDateTime dataAtual) {
        return promocaoRepository.findByDataInicioBeforeAndDataFimAfterOrDataFimIsNull(dataAtual, dataAtual);
    }

    @Override
    public List<Promocao> buscarPorPorcentagemMaiorQue(float porcentagem) {
        return promocaoRepository.findByPorcentagemGreaterThan(porcentagem);
    }

    @Override
    public void deletarPromocao(Long id) {
        promocaoRepository.deleteById(id);
    }

    @Override
    public List<Promocao> listarTodasPromocoes() {
        return promocaoRepository.findAll();
    }

}


