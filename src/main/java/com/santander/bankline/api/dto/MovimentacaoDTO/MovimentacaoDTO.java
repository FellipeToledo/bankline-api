package com.santander.bankline.api.dto.MovimentacaoDTO;

import com.santander.bankline.api.model.MovimantacaoTipo;

/**
 * @author Fellipe Toledo
 * @created 09/05/2022
 */
public class MovimentacaoDTO {

    private String descricao;
    private Double valor;
    private MovimantacaoTipo tipo;
    private Integer idConta;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public MovimantacaoTipo getTipo() {
        return tipo;
    }

    public void setTipo(MovimantacaoTipo tipo) {
        this.tipo = tipo;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }
}
