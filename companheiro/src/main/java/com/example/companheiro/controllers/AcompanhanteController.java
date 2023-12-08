package com.example.companheiro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.companheiro.entities.Acompanhante;
import com.example.companheiro.services.AcompanhanteService;

@RestController
@RequestMapping("/acompanhante")
public class AcompanhanteController {
    
    @Autowired
    private AcompanhanteService acompanhanteService;

    @GetMapping("/{id}")
    public Acompanhante getAcompanhanteById(@PathVariable Long id) {
        return acompanhanteService.getAcompanhante(id);
    }

    @PostMapping
    public Acompanhante saveAcompanhante(@RequestBody Acompanhante acompanhante) {
        return acompanhanteService.salvar(acompanhante);
    }

    @PutMapping
    public Acompanhante atualizarAcompanhante(@RequestBody Acompanhante acompanhante) {
        return acompanhanteService.atualizar(acompanhante);
    }

    @DeleteMapping("/{id}")
    public void deleteAcompanhante(@PathVariable Long id) {
        acompanhanteService.remover(id);
    }
}
