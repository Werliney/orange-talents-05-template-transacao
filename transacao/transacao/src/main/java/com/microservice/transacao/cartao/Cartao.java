package com.microservice.transacao.cartao;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Cartao {

    @Id
    private UUID id;
    private String email;

    public Cartao() {
    }

    public Cartao(String id, String email) {
        this.id = UUID.fromString(id);
        this.email = email;
    }
}
