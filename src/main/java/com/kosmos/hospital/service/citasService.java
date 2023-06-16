package com.kosmos.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosmos.hospital.model.citas;
import com.kosmos.hospital.repository.citasRepository;

@Service
public class citasService {
    public final citasRepository citasRepository;

    @Autowired
    public citasService(citasRepository citasRepository) {
        this.citasRepository = citasRepository;
    }
    // GET

    public List<citas> getCitas(citasRepository citasRepository) {
        return citasRepository.findAll();
    }

    // POST
    public citas postCitas(citas citas) {
        System.out.println("Cita creada" + citas.toString());
        return citasRepository.save(citas);
    }

}
