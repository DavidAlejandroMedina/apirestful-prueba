package com.example.apirestful.service;

import com.example.apirestful.model.Persona;
import org.springframework.stereotype.Service;
import com.example.apirestful.repository.PersonaRepository;

import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public void create(Persona persona){
        personaRepository.insert(persona);
    }

    public void save(Persona persona){
        personaRepository.save(persona);
    }

    public List<Persona> findAll(){
        return personaRepository.findAll();
    }

    public Optional<Persona> findById(String id){
        return personaRepository.findById(id);
    }

    public void deleteById(String id){
        personaRepository.deleteById(id);
    }
}
