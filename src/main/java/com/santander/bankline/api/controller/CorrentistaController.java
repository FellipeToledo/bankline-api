package com.santander.bankline.api.controller;

import com.santander.bankline.api.model.Correntista;
import com.santander.bankline.api.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Fellipe Toledo
 * @created 05/05/2022
 */

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository repository;

    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();
    }

}
