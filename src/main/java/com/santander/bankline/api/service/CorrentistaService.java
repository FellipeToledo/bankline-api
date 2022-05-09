package com.santander.bankline.api.service;

import com.santander.bankline.api.dto.CorrentistaDTO;
import com.santander.bankline.api.model.Conta;
import com.santander.bankline.api.model.Correntista;
import com.santander.bankline.api.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Fellipe Toledo
 * @created 06/05/2022
 */

@Service
public class CorrentistaService {

    @Autowired
    private CorrentistaRepository repository;

    public void save(CorrentistaDTO correntistaDTO) {
        Correntista correntista = new Correntista();
        correntista.setCpf(correntistaDTO.getCpf());
        correntista.setNome(correntistaDTO.getNome());

        Conta conta = new Conta();
        conta.setSaldo(0.0);
        conta.setNumero(new Date().getTime());

        correntista.setConta(conta);

        repository.save(correntista);
    }


}
