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

import com.example.companheiro.entities.Servico;
import com.example.companheiro.services.ServicoService;

@RestController
@RequestMapping("/servico")
public class ServicoController {
    
    @Autowired
    private ServicoService servicoService;

    @GetMapping("/{id}")
    public Servico getServicoById(@PathVariable Long id) {
        return servicoService.getServico(id);
    }

    @PostMapping
    public Servico saveServico(@RequestBody Servico servico) {
        return servicoService.salvar(servico);
    }

    @PutMapping
    public Servico atualizarCliente(@RequestBody Servico servico) {
        return servicoService.atualizar(servico);
    }

    @DeleteMapping("/{id}")
    public void deleteServico(@PathVariable Long id) {
        servicoService.remover(id);
    }
}
