package com.kosmos.hospital.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultorios")
public class consultorios {
    /*
     * Consultorios (3 a 5 para el ejercicio, se pueden insertar manualmente)
     * • Numero de consultorio
     * • Piso
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int numeroConsultorio;
    private int piso;

    public consultorios(int numeroConsultorio, int piso) {
        this.numeroConsultorio = numeroConsultorio;
        this.piso = piso;
    }

    public consultorios() {
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public int getPiso() {
        return piso;
    }

    public void setNumeroConsultorio(int numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
}
