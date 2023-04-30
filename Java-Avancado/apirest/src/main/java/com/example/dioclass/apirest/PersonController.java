package com.example.dioclass.apirest;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    
    private final PersonRepository repositoryPerson;

    public PersonController(PersonRepository repositoryPerson) {
        this.repositoryPerson = repositoryPerson;
    }

    @GetMapping("/")
     public String helloWorld() {
        return ("This is my first API in Spring Boot!");
    }

    // Estão dispostos os métodos de requisição
    @GetMapping("/persons")
    public List<Person> consultAllPersons() {
        return repositoryPerson.findAll();
    }

    @GetMapping("/persons/{id}")
    public Optional<Person> consultById(@PathVariable long id) {
        return repositoryPerson.findById(id);
    }
}
