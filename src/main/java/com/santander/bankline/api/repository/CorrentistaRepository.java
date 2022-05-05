package com.santander.bankline.api.repository;

import com.santander.bankline.api.model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author Fellipe Toledo
 * @created 05/05/2022
 */
public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
}
