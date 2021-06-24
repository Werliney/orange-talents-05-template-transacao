package com.microservice.transacao.estabelecimento;

import javax.validation.constraints.NotBlank;

public class EstabelecimentoResponse {

    @NotBlank
    private String nome;
    @NotBlank
    private String cidade;
    @NotBlank
    private String endereco;

    public EstabelecimentoResponse() {
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public Estabelecimento converter() {
        return new Estabelecimento(nome, cidade, endereco);
    }
}
