package com.example.companheiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.companheiro.entities.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {

}
