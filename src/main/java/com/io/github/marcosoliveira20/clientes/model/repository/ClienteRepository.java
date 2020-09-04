package com.io.github.marcosoliveira20.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.io.github.marcosoliveira20.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
