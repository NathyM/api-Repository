package apiController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import domain.repository.ClienteRepository;
import domain.cliente.Cliente;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
public class ClienteController {

    @Autowired
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
    public ResponseEntity<Object> b_retorna_clientes() {
        return ResponseEntity.accepted().body(clienteRepository.findAll());
    }
}