package br.cliente.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.cliente.domain.repository.ClienteRepository;
import br.cliente.domain.cliente.Cliente;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
public class ClienteController {


    ClienteRepository clienteRepository;

    @PostMapping("/cliente")
    public ResponseEntity<Object> salvarCliente(@RequestBody Cliente cliente) {
        LocalDateTime dataAtual = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
        cliente.setDataDeCadastro(dataAtual);
        try {
            Cliente clienteSalvo = clienteRepository.save(cliente);
            return ResponseEntity.accepted().body(clienteSalvo);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(false);
        }
    }

    @GetMapping("/cliente/todos")
    public ResponseEntity<Object> retornaClientes() {
        return ResponseEntity.accepted().body(clienteRepository.findAll());
    }
}