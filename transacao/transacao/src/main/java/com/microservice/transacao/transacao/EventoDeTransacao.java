package com.microservice.transacao.transacao;

import com.microservice.transacao.cartao.CartaoResponse;
import com.microservice.transacao.estabelecimento.EstabelecimentoResponse;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;

public class EventoDeTransacao {

    @NotBlank
    private String id;
    private BigDecimal valor;
    private EstabelecimentoResponse estabelecimento;
    private CartaoResponse cartao;
    private LocalDate efetivadaEm;

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoResponse getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoResponse getCartao() {
        return cartao;
    }

    public LocalDate getEfetivadaEm() {
        return efetivadaEm;
    }

    public Transacao converter() {
        return new Transacao(id, valor, estabelecimento.converter(), cartao.converter(), efetivadaEm);
    }
}
