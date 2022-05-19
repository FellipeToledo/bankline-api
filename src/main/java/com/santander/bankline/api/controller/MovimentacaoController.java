package com.santander.bankline.api.controller;

import com.santander.bankline.api.dto.CorrentistaDTO;
import com.santander.bankline.api.dto.MovimentacaoDTO.MovimentacaoDTO;
import com.santander.bankline.api.model.Correntista;
import com.santander.bankline.api.model.Movimentacao;
import com.santander.bankline.api.repository.CorrentistaRepository;
import com.santander.bankline.api.repository.MovimentacaoRepository;
import com.santander.bankline.api.service.CorrentistaService;
import com.santander.bankline.api.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Fellipe Toledo
 * @created 05/05/2022
 */

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoService service;
    @Autowired
    private MovimentacaoRepository repository;

    @GetMapping
    public List<Movimentacao> findAll(){
        return repository.findAll();
    }

    @GetMapping("/{idConta}")
    public List<Movimentacao> findAll(@PathVariable("idConta") Integer idConta){
        return repository.findByIdConta(idConta);
    }

    @PostMapping
    public void save (@RequestBody MovimentacaoDTO movimentacao){
       service.save(movimentacao);

    }



}
