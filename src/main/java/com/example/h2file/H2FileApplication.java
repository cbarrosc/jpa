package com.example.h2file;

import com.example.h2file.model.onetooneunidirectional.Address;
import com.example.h2file.model.onetooneunidirectional.User;
import com.example.h2file.repository.AddressRepository;
import com.example.h2file.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class H2FileApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(H2FileApplication.class, args);


//		onetoone unidireccional
		AddressRepository addressRepository = configurableApplicationContext.getBean(AddressRepository.class);
		UserRepository userRepository = configurableApplicationContext.getBean(UserRepository.class);

		Address address = new Address("home st.");
		addressRepository.save(address);

		User user = new User("John Doe", address);
		userRepository.save(user);


	}

}
