package com.example.h2file.repository;

import com.example.h2file.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository  extends CrudRepository<Person,Long> {
}
