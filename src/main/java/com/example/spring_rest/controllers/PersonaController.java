package com.example.spring_rest.controllers;

import com.example.spring_rest.models.Persona;
import com.example.spring_rest.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/personas")
    public List<Persona> listarPersonas() {
        return personaService.getAllPersona();
    }
    @GetMapping("/personas/{id}")
    public Persona obtenerPersona(@PathVariable Integer id) {
        return personaService.getPersonaById(id);
    }
}
