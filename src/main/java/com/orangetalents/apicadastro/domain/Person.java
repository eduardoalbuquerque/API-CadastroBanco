package com.orangetalents.apicadastro.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private LocalDate birthday;
}
