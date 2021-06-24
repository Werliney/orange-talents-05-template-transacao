package com.microservice.transacao.cartao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
public class Cartao {

    @Id
    private UUID id;
    @NotBlank
    @Email
    private String email;

    public Cartao() {
    }

    public Cartao(String id, String email) {
        this.id = UUID.fromString(id);
        this.email = email;
    }
}
