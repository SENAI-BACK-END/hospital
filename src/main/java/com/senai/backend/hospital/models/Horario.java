package com.senai.backend.hospital.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="agenda")

public class Horario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="hora_inicio")
    private LocalDate horaInicio;

    @Column(name="hora_final")
    private LocalDate horaFinal;

    @Column(name="dia")
    private Integer dia;
    
}