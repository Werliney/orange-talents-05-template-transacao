package com.microservice.transacao.cartao;

import javax.validation.constraints.NotBlank;

public class CartaoResponse {

    @NotBlank
    private String id;
    @NotBlank
    private String email;

    public CartaoResponse() {
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Cartao converter() {
        return new Cartao(id, email);
    }
}
