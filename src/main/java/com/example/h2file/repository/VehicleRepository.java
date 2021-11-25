package com.example.h2file.repository;

import com.example.h2file.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface VehicleRepository extends CrudRepository<Vehicle,Long> {
}
