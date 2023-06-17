package com.kosmos.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosmos.hospital.model.citas;
import com.kosmos.hospital.model.consultorio;
import com.kosmos.hospital.repository.citasRepository;

@Service
public class citasService {
    public final citasRepository citasRepository;

    @Autowired
    public citasService(citasRepository citasRepository) {
        this.citasRepository = citasRepository;
    }
    // GET

    public List<citas> getCitas() {
        return citasRepository.findAll();
    }

    // POST

    /*
     * Reglas del negocio
     * Alta de cita:
     * 
     * Solicitar los datos necesarios obligatorios para agendar una cita.
     * Reglas para el alta de cita:
     * 
     * No se puede agendar una cita en un mismo consultorio a la misma hora.
     * No se puede agendar una cita para un mismo doctor a la misma hora.
     * No se puede agendar una cita para un paciente a la misma hora o con menos de
     * 2 horas de diferencia para el mismo día. Esto significa que si un paciente
     * tiene una cita de 2 a 3 pm, solo podría tener otra cita el mismo día a partir
     * de las 5 pm.
     * Un mismo doctor no puede tener más de 8 citas en un día.
     * Consulta de citas:
     * 
     * Posibilidad de consultar citas por fecha, consultorio y doctor. Por ejemplo,
     * si el doctor se llama Dr. Ramos y desea saber cuántas citas tiene para hoy o
     * mañana, debe ser posible consultarlo en el sistema.
     * Posibilidad de cancelar una cita que aún esté pendiente de realizarse según
     * su horario.
     * Posibilidad de editar una cita, teniendo en cuenta las reglas establecidas
     * para el alta de cita.
     */
    public citas postCitas(citas citas) {
        System.out.println("Cita creada" + citas.toString());
        // No se puede agendar una cita en un mismo consultorio a la misma hora.

        return citasRepository.save(citas);
    }

}
