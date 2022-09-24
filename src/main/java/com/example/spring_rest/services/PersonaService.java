package com.example.spring_rest.services;

import com.example.spring_rest.models.Persona;
import com.example.spring_rest.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository repository;

    public List<Persona> getAllPersona() {
        return repository.findAll();
    }
    public Persona getPersonaById(Integer id) {
        return repository.findById(id).get();
    }
}
