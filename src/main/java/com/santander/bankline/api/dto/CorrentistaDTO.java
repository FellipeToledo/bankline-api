package com.santander.bankline.api.dto;

/**
 * @author Fellipe Toledo
 * @created 06/05/2022
 */
public class CorrentistaDTO {

    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
