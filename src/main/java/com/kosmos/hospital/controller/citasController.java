package com.kosmos.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public void getCitas() {
        citasService.getCitas(citasService.citasRepository);
    }

}
