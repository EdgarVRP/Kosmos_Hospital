package com.kosmos.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kosmos.hospital.model.citas;
import com.kosmos.hospital.service.citasService;

@RestController
@RequestMapping(path = "/citas")
public class citasController {
    private final citasService citasService;

    @Autowired
    public citasController(citasService citasService) {
        this.citasService = citasService;
    }

    // GET

    @GetMapping
    public List<citas> getCitas() {
        return citasService.getCitas();
    }

    // POST

    @PostMapping()
    public citas postCitas(@RequestBody citas citas) {
        return citasService.postCitas(citas);
    }
}
