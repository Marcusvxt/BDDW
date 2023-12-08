package com.example.companheiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.companheiro.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
