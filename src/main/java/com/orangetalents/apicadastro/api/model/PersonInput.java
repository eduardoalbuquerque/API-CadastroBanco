package com.orangetalents.apicadastro.api.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
public class PersonInput {

    @NotNull
    @Size(min = 10, max = 100)
    private String name;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @CPF
    private String cpf;
    @Past
    private LocalDate birthday;

}
