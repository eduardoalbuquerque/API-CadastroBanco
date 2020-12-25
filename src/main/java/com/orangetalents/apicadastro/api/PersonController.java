package com.orangetalents.apicadastro.api;

import com.orangetalents.apicadastro.domain.Person;
import com.orangetalents.apicadastro.domain.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository){
        this.repository=repository;
    }

    @PostMapping
    public Person save(@RequestBody Person person){
        return repository.save(person);
    }

}
