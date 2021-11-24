package com.example.h2file.repository;

import com.example.h2file.model.onetoonebidirectional.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
