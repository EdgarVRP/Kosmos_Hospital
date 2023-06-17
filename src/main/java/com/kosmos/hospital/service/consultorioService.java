package com.kosmos.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosmos.hospital.model.consultorio;
import com.kosmos.hospital.repository.consultorioRepository;

@Service
public class consultorioService {

    private final consultorioRepository consultoriosRepository;

    @Autowired
    public consultorioService(consultorioRepository consultoriosRepository) {
        this.consultoriosRepository = consultoriosRepository;
    }

    // GET

    public List<consultorio> getConsultorios() {
        return consultoriosRepository.findAll();
    }

    // POST

    public consultorio postConsultorios(consultorio consultorios) {
        System.out.println("Consultorio creado" + consultorios.toString());
        return consultoriosRepository.save(consultorios);
    }
}
