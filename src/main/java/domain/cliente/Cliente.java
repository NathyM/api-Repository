package domain.cliente;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

    @Entity
    public class Cliente {

        private @Id
        @GeneratedValue
        long id;
        private String nome;
        private String endereco;
        private String email;
        private LocalDateTime dataDeCadastro;

        public Cliente() {
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public LocalDateTime getDataDeCadastro() {
            return dataDeCadastro;
        }

        public void setDataDeCadastro(LocalDateTime dataDeCadastro) {
            this.dataDeCadastro = dataDeCadastro;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", endereço='" + endereco + '\'' +
                    ", email='" + email + '\'' +
                    ", dataDeCadastro=" + dataDeCadastro +
                    '}';
        }
}
