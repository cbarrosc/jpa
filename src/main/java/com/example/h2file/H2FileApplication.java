package com.example.h2file;

import com.example.h2file.model.Person;
import com.example.h2file.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class H2FileApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(H2FileApplication.class, args);

		PersonRepository personRepository = configurableApplicationContext.getBean(PersonRepository.class);
		Person myPerson = new Person("John", "Doe");
		personRepository.save(myPerson);



	}

}
