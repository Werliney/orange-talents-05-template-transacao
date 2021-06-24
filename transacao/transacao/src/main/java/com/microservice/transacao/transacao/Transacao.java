package com.microservice.transacao.transacao;

import com.microservice.transacao.cartao.Cartao;
import com.microservice.transacao.estabelecimento.Estabelecimento;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Transacao {

    @Id
    private UUID id;
    @Positive
    private BigDecimal valor;
    private LocalDate efetivadaEm;

    @OneToOne
    private Estabelecimento estabelecimento;

    @OneToOne
    private Cartao cartao;

    public Transacao() {
    }


    public Transacao(String id, BigDecimal valor, Estabelecimento estabelecimento, Cartao cartao, LocalDate efetivadaEm) {
        this.id = UUID.fromString(id);
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }
}
