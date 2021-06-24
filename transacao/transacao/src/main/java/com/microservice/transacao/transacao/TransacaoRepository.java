package com.microservice.transacao.transacao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface TransacaoRepository extends JpaRepository<Transacao, UUID> {

    @Query("SELECT t FROM Transacao t WHERE t.cartao.id =:id")
    List<Transacao> retornaTransacoesDeCartao(UUID id, Pageable pageable);
}
