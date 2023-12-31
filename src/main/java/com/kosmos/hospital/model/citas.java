package com.kosmos.hospital.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "citas")
public class citas {
    /*
     * Citas (se generan dinámicamente)
     * • Consultorio
     * • Doctor
     * • Horario de consulta
     * • Nombre del paciente
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private int idCita;
    private consultorio consultorio;
    private empleado doctor;
    private String horario;
    private String nombrePaciente;

    public citas(consultorio consultorio, empleado doctor, String horario, String nombrePaciente) {
        this.consultorio = consultorio;
        this.doctor = doctor;
        this.horario = horario;
        this.nombrePaciente = nombrePaciente;
    }

    @Override
    public String toString() {
        return "citas [consultorio=" + consultorio + ", doctor=" + doctor + ", horario=" + horario + ", nombrePaciente="
                + nombrePaciente + "]";
    }
}
