package com.kosmos.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kosmos.hospital.model.citas;
import com.kosmos.hospital.model.empleado;
import com.kosmos.hospital.service.citasService;
import com.kosmos.hospital.service.empleadoService;

@RestController
@RequestMapping(path = "/empleado")
public class empleadoController {
    private final empleadoService empleadoService;

    @Autowired
    public empleadoController(empleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    // GET

    @GetMapping
    public List<empleado> getEmpleados() {
        return empleadoService.getEmpleados();
    }

    // POST

    @PostMapping()
    public empleado postEmpleado(@RequestBody empleado empleado) {
        return empleadoService.postEmpleado(empleado);
    }
}
