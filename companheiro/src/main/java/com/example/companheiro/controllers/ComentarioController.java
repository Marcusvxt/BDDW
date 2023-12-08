package com.example.companheiro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.companheiro.entities.Comentario;
import com.example.companheiro.services.ComentarioService;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {
    
    @Autowired
    private ComentarioService comentarioService;

    @GetMapping("/{id}")
    public Comentario getComentarioById(@PathVariable Long id) {
        return comentarioService.getComentario(id);
    }

    @PostMapping
    public Comentario saveComentario(@RequestBody Comentario comentario) {
        return comentarioService.salvar(comentario);
    }

    @DeleteMapping("/{id}")
    public void deleteComentario(@PathVariable Long id) {
        comentarioService.remover(id);
    }
}
