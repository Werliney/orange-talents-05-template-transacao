package com.microservice.transacao.estabelecimento;

public class EstabelecimentoResponse {


    private String nome;
    private String cidade;
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
