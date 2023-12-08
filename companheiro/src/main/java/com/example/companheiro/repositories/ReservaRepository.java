package com.example.companheiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.companheiro.entities.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}
