package com.example.spring_rest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {
    //Declaración de Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String last_name;

    //Constructores
    public Persona() {}

    public Persona(Integer id, String name, String last_name) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
    }

    //Getters
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLast_name() {
        return last_name;
    }
    //Setters
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
