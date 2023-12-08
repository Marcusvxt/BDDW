package com.example.companheiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.companheiro.entities.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

}
