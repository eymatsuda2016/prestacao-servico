package com.eymatsuda.clientes;

import com.eymatsuda.clientes.model.entity.Cliente;
import com.eymatsuda.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController(value="/clientes")
public class ClientesApplication {

    @Autowired
    ClienteRepository repository;

    @Bean
    public CommandLineRunner run(){
        return  args -> {
            Cliente cliente = Cliente.builder().cpf("12345678900").nome("Fulano de Tal").build();
            repository.save(cliente);
        };
    }



    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);
    }
}
