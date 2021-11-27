package com.example.apirestful.controller;

import com.example.apirestful.model.Persona;
import com.example.apirestful.repository.PersonaRepository;
import org.springframework.web.bind.annotation.*;
import com.example.apirestful.service.PersonaService;

import java.util.List;

@RestController
//@RequestMapping("/api/v1")
//@RequiredArgsConstructor
public class PersonaController {

    private final PersonaRepository personaRepository;

    public PersonaController(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @PostMapping("/register")
    Persona newPersona(@RequestBody Persona persona){
        return personaRepository.save(persona);
    }

}
