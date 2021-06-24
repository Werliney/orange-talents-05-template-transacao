package com.microservice.transacao.kafka;

import com.microservice.transacao.transacao.EventoDeTransacao;
import com.microservice.transacao.transacao.Transacao;
import com.microservice.transacao.transacao.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "transacoes")
    public void ouvir(EventoDeTransacao eventoDeTransacao) {
        Transacao transacao = eventoDeTransacao.converter();
        transacaoRepository.save(transacao);
    }

}
