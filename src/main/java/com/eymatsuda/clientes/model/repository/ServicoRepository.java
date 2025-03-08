package com.eymatsuda.clientes.model.repository;

import com.eymatsuda.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Cliente, Integer> {
}
