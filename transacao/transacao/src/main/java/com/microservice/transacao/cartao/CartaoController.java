package com.microservice.transacao.cartao;

import com.microservice.transacao.transacao.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/cartoes")
public class CartaoController {

    @Autowired
    CartaoRepository cartaoRepository;
    @Autowired
    TransacaoRepository transacaoRepository;

    @GetMapping("/{id}/transacoes")
    public ResponseEntity<?> listaTransacoes(@PathVariable UUID id) {
        Optional<Cartao> cartao = cartaoRepository.findById(id);

        if(!cartao.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        PageRequest pageRequest = PageRequest.of(1, 10);
        return ResponseEntity.ok().body(transacaoRepository.retornaTransacoesDeCartao(cartao.get().getId(), pageRequest));
    }
}
