package com.senai.backend.hospital.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="agenda")

public class Agenda {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="tratamento")
    private boolean tratamento;

    @Column(name="consulta")
    private boolean consulta;

    @Column(name="custo")
    private Double custo;

    @Column(name="categoria")
    private String categoria;

    @Column(name="descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name="id_medico")
    private Medico medico;

    @JoinColumn(name="id_´paciente")
    private Paciente paciente;
}
