package com.santander.bankline.api.repository;

import com.santander.bankline.api.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Fellipe Toledo
 * @created 05/05/2022
 */
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

    public List<Movimentacao> findByIdConta(Integer idConta);
}
