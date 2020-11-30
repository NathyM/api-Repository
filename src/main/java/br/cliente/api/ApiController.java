package br.cliente.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    @GetMapping("/")
    public ResponseEntity<String> home() {
        HttpStatus status = HttpStatus.ACCEPTED;
        return ResponseEntity.status(status).body("Página Inicial da API." +
                "<br><br><a href='swagger-ui.html'>Documentação</a><br>");
    }
}
