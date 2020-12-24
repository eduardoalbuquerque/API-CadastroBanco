package com.orangetalents.apicadastro.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false, length = 60)
    private String email;
    @Column(nullable = false, length = 14)
    private String cpf;
    private LocalDate birthday;
}
