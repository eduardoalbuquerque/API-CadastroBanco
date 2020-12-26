package com.orangetalents.apicadastro.api.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class PersonOutput {

    private String name;
    private String email;
    private String cpf;
    private LocalDate birthday;
    private Integer age;

}
