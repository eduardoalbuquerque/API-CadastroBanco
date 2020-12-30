package com.orangetalents.apicadastro.api;

import com.orangetalents.apicadastro.api.model.PersonInput;
import com.orangetalents.apicadastro.api.model.PersonOutput;
import com.orangetalents.apicadastro.api.model.dto.PersonDTO;
import com.orangetalents.apicadastro.api.model.dto.exceptionHandler.CampoDuplicadoException;
import com.orangetalents.apicadastro.domain.repository.PersonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<?> save(@Valid @RequestBody PersonInput personInput){

        if(!repository.findByCpf(personInput.getCpf()).isEmpty()){
            throw new CampoDuplicadoException("CPF Já cadastrado!");
        }

        if(!repository.findByEmail(personInput.getEmail()).isEmpty()){
            throw new CampoDuplicadoException("Email Já cadastrado!");
        }

        PersonOutput output= personDTO.toPersonOutput(repository.save(personDTO.toPerson(personInput)));
        return new ResponseEntity<>(output,HttpStatus.CREATED);

    }


}
