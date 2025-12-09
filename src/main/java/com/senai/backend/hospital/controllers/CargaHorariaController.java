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

import com.senai.backend.hospital.models.CargaHoraria;
import com.senai.backend.hospital.services.CargaHorariaService;

@RestController
@RequestMapping("/carga_horaria")
public class CargaHorariaController {
    
    @Autowired
    private CargaHorariaService cargaHorariaServiceService;

    
    // salvar - POST
    @PostMapping("/salvar")
    public CargaHoraria salvar(@RequestBody CargaHoraria CargaHoraria) {
        return cargaHorariaServiceService.salvar(CargaHoraria);
    }

    // buscar pelo id - GET
    @GetMapping("/buscarPorId/{id}")
    public CargaHoraria buscarPorId(@PathVariable Integer id) {
        return cargaHorariaServiceService.buscarPorId(id);
    }

    // listar todos - GET
    @GetMapping("/listar")
    public List<CargaHoraria> listarTodos() {
        return cargaHorariaServiceService.listarTodos();
    }

    // contar - GET
    @GetMapping("/contar")
    public long contar() {
        return cargaHorariaServiceService.contar();
    }

    // remover pelo id - DELETE
    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id) {
        if (cargaHorariaServiceService.removerPorId(id)) {
            return "CargaHoraria removido com sucesso!";
        }
        return "Falha ao remover CargaHoraria!";
    }

    // atualizar - PUT
    @PutMapping("/atualizar/{id}")
    public CargaHoraria atualizar(@PathVariable Integer id, @RequestBody CargaHoraria CargaHoraria) {
        return cargaHorariaServiceService.atualizar(id, CargaHoraria);
    }

}