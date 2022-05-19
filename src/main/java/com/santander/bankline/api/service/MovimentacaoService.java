package com.santander.bankline.api.service;

import com.santander.bankline.api.dto.MovimentacaoDTO.MovimentacaoDTO;
import com.santander.bankline.api.model.Correntista;
import com.santander.bankline.api.model.MovimantacaoTipo;
import com.santander.bankline.api.model.Movimentacao;
import com.santander.bankline.api.repository.CorrentistaRepository;
import com.santander.bankline.api.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author Fellipe Toledo
 * @created 09/05/2022
 */
@Service
public class MovimentacaoService {
    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private CorrentistaRepository correntistaRepository;

    public void save(MovimentacaoDTO movimentacaoDTO) {
        Movimentacao movimentacao = new Movimentacao();

        Double valor = movimentacaoDTO.getTipo()== MovimantacaoTipo.RECEITA
                ? movimentacaoDTO.getValor()
                : movimentacaoDTO.getValor() * -1;

        movimentacao.setDataHora(LocalDateTime.now());
        movimentacao.setDescricao(movimentacaoDTO.getDescricao());
        movimentacao.setTipo(movimentacaoDTO.getTipo());
        movimentacao.setIdConta(movimentacaoDTO.getIdConta());
        movimentacao.setValor(valor);

        Correntista correntista = correntistaRepository.findById(movimentacaoDTO.getIdConta()).orElse(null);
        if (correntista != null) {
            correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
            correntistaRepository.save(correntista);
        }
        repository.save(movimentacao);
    }


}
