package com.example.companheiro.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.companheiro.entities.Comentario;
import com.example.companheiro.repositories.ComentarioRepository;

@Service
public class ComentarioService {
    
    @Autowired
    private ComentarioRepository comentarioRepository;

    public Comentario getComentario(Long idComentario) {
        Optional<Comentario> comentario = comentarioRepository.findById(idComentario);
        return comentario.get();
    }

    public Comentario salvar(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    public void remover(Long idComentario) {
        comentarioRepository.deleteById(idComentario);
    }
}
