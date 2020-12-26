package com.orangetalents.apicadastro.api;

import com.orangetalents.apicadastro.api.model.PersonInput;
import com.orangetalents.apicadastro.api.model.PersonOutput;
import com.orangetalents.apicadastro.api.model.dto.PersonDTO;
import com.orangetalents.apicadastro.domain.repository.PersonRepository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private final PersonRepository repository;
    private PersonDTO personDTO;

    public PersonController(PersonRepository repository, PersonDTO personDTO){
        this.repository=repository;
        this.personDTO = personDTO;
    }

    @PostMapping
    public PersonOutput save(@Valid @RequestBody PersonInput personInput){
        return personDTO.toPersonOutput(repository.save(personDTO.toPerson(personInput)));
    }



}
