package com.eymatsuda.clientes.rest;

import com.eymatsuda.clientes.model.entity.Cliente;
import com.eymatsuda.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/clientes")
public class ClienteController {

    private final ClienteRepository repository;

    @Autowired
    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    //Pode ser Injetado tambem desta forma, porem desta forma a injeção fica como opcional
    /*public void setRepository(ClienteRepository repository){
        this.repository=repository;
    }*/

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody Cliente cliente){
       return repository.save(cliente);
    }
}
