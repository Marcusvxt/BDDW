package com.example.companheiro.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.companheiro.entities.Reserva;
import com.example.companheiro.repositories.ReservaRepository;

@Service
public class ReservaService {
    
    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva getReserva(Long idReserva) {
        Optional<Reserva> reserva = reservaRepository.findById(idReserva);
        return reserva.get();
    }

    public Reserva salvar(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public void remover(Long idReserva) {
        reservaRepository.deleteById(idReserva);
    }
}
