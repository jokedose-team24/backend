package com.cpe.team24.controller;

import com.cpe.team24.entity.BaggageType;
import com.cpe.team24.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://172.17.0.201:8080")
@RestController
@RequestMapping("/api/baggage-type")
public class BaggageTypeController {

    @Autowired
    private final BaggageTypeRepository baggagetypeRepository;

    public BaggageTypeController(BaggageTypeRepository baggagetypeRepository) {
        this.baggagetypeRepository = baggagetypeRepository;
    }

    @GetMapping("")
    public Collection<BaggageType> getAllBaggageType() {
        return baggagetypeRepository.findAll();
    }

}