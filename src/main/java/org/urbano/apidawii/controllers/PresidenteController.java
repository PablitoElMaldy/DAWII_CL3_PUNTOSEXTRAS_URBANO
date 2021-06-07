package org.urbano.apidawii.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.urbano.apidawii.Models.Presidente;
import org.urbano.apidawii.Services.PresidenteServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/presidentes")
public class PresidenteController {

    @Autowired
    private PresidenteServiceImpl service;

    @GetMapping("/all")
    public ResponseEntity<List<Presidente>> presidentes(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}