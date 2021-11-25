package com.example.h2file.repository;

import com.example.h2file.model.Viewer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewerRepository extends CrudRepository<Viewer,Long> {
}
