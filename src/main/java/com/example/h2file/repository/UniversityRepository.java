package com.example.h2file.repository;

import com.example.h2file.model.onetomanyunidirectional.University;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends CrudRepository<University,Long> {
}
