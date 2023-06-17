package com.kosmos.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kosmos.hospital.model.citas;
import com.kosmos.hospital.model.consultorio;
import com.kosmos.hospital.service.citasService;
import com.kosmos.hospital.service.consultorioService;

@RestController
@RequestMapping(path = "/consultorios")
public class consultoriosController {
    private final consultorioService consultorioService;

    @Autowired
    public consultoriosController(consultorioService consultorioService) {
        this.consultorioService = consultorioService;
    }
    // GET

    @GetMapping
    public List<consultorio> geConsultorios() {
        return consultorioService.getConsultorios();
    }

    @PostMapping()
    public consultorio postConsultorios(@RequestBody consultorio consultorios) {
        return consultorioService.postConsultorios(consultorios);
    }
}
