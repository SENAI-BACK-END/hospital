package com.senai.backend.hospital.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.hospital.models.Medico;
import com.senai.backend.hospital.services.MedicoService;

@RestController
@RequestMapping("/medico")
public class MedicoController {
    
    @Autowired
    private MedicoService MedicoService;

    
    // salvar - POST
    @PostMapping("/salvar")
    public Medico salvar(@RequestBody Medico Medico) {
        return MedicoService.salvar(Medico);
    }

    // buscar pelo id - GET
    @GetMapping("/buscarPorId/{id}")
    public Medico buscarPorId(@PathVariable Integer id) {
        return MedicoService.buscarPorId(id);
    }

    // listar todos - GET
    @GetMapping("/listar")
    public List<Medico> listarTodos() {
        return MedicoService.listarTodos();
    }

    // contar - GET
    @GetMapping("/contar")
    public long contar() {
        return MedicoService.contar();
    }

    // remover pelo id - DELETE
    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id) {
        if (MedicoService.removerPorId(id)) {
            return "Medico removido com sucesso!";
        }
        return "Falha ao remover Medico!";
    }

    // atualizar - PUT
    @PutMapping("/atualizar/{id}")
    public Medico atualizar(@PathVariable Integer id, @RequestBody Medico Medico) {
        return MedicoService.atualizar(id, Medico);
    }

}