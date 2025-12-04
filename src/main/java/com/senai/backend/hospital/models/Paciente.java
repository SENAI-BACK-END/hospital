package com.senai.backend.hospital.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="paciente")

public class Paciente {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="especialidade")
    private String especialidade;

    @Column(name="cim")
    private String cim;

    @Column(name="endereço")
    private String endereço;

    @Column(name="contato")
    private String contato;

    @ManyToOne
    @JoinColumn(name="id_horario")
    private List<Horario> horario;

}