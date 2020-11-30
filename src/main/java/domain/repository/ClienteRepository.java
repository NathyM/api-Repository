package domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import domain.cliente.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}