package com.example.companheiro.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.companheiro.entities.Acompanhante;
import com.example.companheiro.repositories.AcompanhanteRepository;

@Service
public class AcompanhanteService {
    
    @Autowired
    private AcompanhanteRepository acompanhanteRepository;

    public Acompanhante getAcompanhante(Long idAcompanhante) {
        Optional<Acompanhante> acompanhante = acompanhanteRepository.findById(idAcompanhante);
        return acompanhante.get();
    }

    public Acompanhante salvar(Acompanhante acompanhante) {
        return acompanhanteRepository.save(acompanhante);
    }

    public Acompanhante atualizar(Acompanhante acompanhante) {
        return acompanhanteRepository.save(acompanhante);
    }

    public void remover(Long idAcompanhante) {
        acompanhanteRepository.deleteById(idAcompanhante);
    }
}
