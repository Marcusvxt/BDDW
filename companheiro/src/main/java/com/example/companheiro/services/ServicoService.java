package com.example.companheiro.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.companheiro.entities.Servico;
import com.example.companheiro.repositories.ServicoRepository;

@Service
public class ServicoService {
    
    @Autowired
    private ServicoRepository servicoRepository;

    public Servico getServico(Long idServico) {
        Optional<Servico> servico = servicoRepository.findById(idServico);
        return servico.get();
    }

    public Servico salvar(Servico servico) {
        return servicoRepository.save(servico);
    }

    public Servico atualizar(Servico servico) {
        return servicoRepository.save(servico);
    }

    public void remover(Long idServico) {
        servicoRepository.deleteById(idServico);
    }
}
