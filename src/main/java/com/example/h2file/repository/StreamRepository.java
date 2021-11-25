package com.example.h2file.repository;

import com.example.h2file.model.Stream;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamRepository extends CrudRepository<Stream,Long> {
}
