package com.orangetalents.apicadastro.api.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PersonInput {

    private String name;
    private String email;
    private String cpf;
    private LocalDate birthday;

}
