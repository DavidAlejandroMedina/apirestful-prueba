package controller;

import model.Persona;
import org.springframework.web.bind.annotation.*;
import service.PersonaService;

import java.util.List;

@RestController
//@RequestMapping("/api/v1")
//@RequiredArgsConstructor
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping("/register")
    public void save(@RequestBody Persona persona){
        personaService.create(persona);
    }

    @GetMapping("/all")
    public List<Persona> findAll(){
        return personaService.findAll();
    }

    @GetMapping("/find/{id}")
    public Persona findById(@PathVariable String id){
        return personaService.findById(id).get();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String id){
        personaService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Persona persona){
        personaService.save(persona);
    }
}
