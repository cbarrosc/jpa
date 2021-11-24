package com.example.h2file.repository;

import com.example.h2file.model.onetooneunidirectional.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address,Long> {
}
