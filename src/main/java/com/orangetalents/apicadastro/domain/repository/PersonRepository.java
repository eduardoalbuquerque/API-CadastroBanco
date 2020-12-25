package com.orangetalents.apicadastro.domain.repository;

import com.orangetalents.apicadastro.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
