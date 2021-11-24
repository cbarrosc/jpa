package com.example.h2file.repository;

import com.example.h2file.model.onetooneunidirectional.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
