package com.orangetalents.apicadastro.api.model.dto;

import com.orangetalents.apicadastro.api.model.PersonInput;
import com.orangetalents.apicadastro.api.model.PersonOutput;
import com.orangetalents.apicadastro.domain.Person;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;

@Component
public class PersonDTO {

    public Person toPerson(PersonInput personInput){
        Person person = new Person();
        person.setName( personInput.getName());
        person.setCpf(personInput.getCpf());
        person.setEmail(personInput.getEmail());
        person.setBirthday(personInput.getBirthday());
        return person;
    }

    public PersonOutput toPersonOutput (Person person){
        PersonOutput personOutput = new PersonOutput();

        personOutput.setName(person.getName());
        personOutput.setEmail(person.getEmail());
        personOutput.setCpf(person.getCpf());
        personOutput.setBirthday(person.getBirthday());
        personOutput.setAge(Period.between(person.getBirthday(),LocalDate.now()).getYears());

        return personOutput;
    }
}
