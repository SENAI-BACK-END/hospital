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

import com.senai.backend.hospital.models.Categoria;
import com.senai.backend.hospital.services.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService CategoriaService;

    
    // salvar - POST
    @PostMapping("/salvar")
    public Categoria salvar(@RequestBody Categoria categoria) {
        return CategoriaService.salvar(categoria);
    }

    // buscar pelo id - GET
    @GetMapping("/buscarPorId/{id}")
    public Categoria buscarPorId(@PathVariable Integer id) {
        return CategoriaService.buscarPorId(id);
    }

    // listar todos - GET
    @GetMapping("/listar")
    public List<Categoria> listarTodos() {
        return CategoriaService.listarTodos();
    }

    // contar - GET
    @GetMapping("/contar")
    public long contar() {
        return CategoriaService.contar();
    }

    // remover pelo id - DELETE
    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id) {
        if (CategoriaService.removerPorId(id)) {
            return "Categoria removido com sucesso!";
        }
        return "Falha ao remover Categoria!";
    }

    // atualizar - PUT
    @PutMapping("/atualizar/{id}")
    public Categoria atualizar(@PathVariable Integer id, @RequestBody Categoria Categoria) {
        return CategoriaService.atualizar(id, Categoria);
    }

}