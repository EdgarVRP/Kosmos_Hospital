package com.kosmos.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.kosmos.hospital.model.empleado;
import com.kosmos.hospital.repository.empleadoRepository;

@Service
public class empleadoService {
    private final empleadoRepository empleadoRepository;

    @Autowired
    public empleadoService(empleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    // GET

    public List<empleado> getEmpleados() {
        return empleadoRepository.findAll();
    }

    // POST

    public empleado postEmpleado(empleado empleado) {
        System.out.println("Empleado creado");
        return empleadoRepository.save(empleado);
    }

}
