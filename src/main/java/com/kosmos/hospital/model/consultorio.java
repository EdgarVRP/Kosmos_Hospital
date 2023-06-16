package com.kosmos.hospital.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultorio")
public class consultorio {
    /*
     * Consultorios (3 a 5 para el ejercicio, se pueden insertar manualmente)
     * • Numero de consultorio
     * • Piso
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consultorio")
    private int idConsultorio;
    private int numeroConsultorio;
    private int piso;

    public consultorio(int numeroConsultorio, int piso) {
        this.numeroConsultorio = numeroConsultorio;
        this.piso = piso;
    }

    public int getIdConsultorio() {
        return this.idConsultorio;
    }

    public void setIdConsultorio(int idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public int getNumeroConsultorio() {
        return this.numeroConsultorio;
    }

    public void setNumeroConsultorio(int numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public int getPiso() {
        return this.piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        return "consultorio [idConsultorio=" + idConsultorio + ", numeroConsultorio=" + numeroConsultorio + ", piso="
                + piso + "]";
    }
}
