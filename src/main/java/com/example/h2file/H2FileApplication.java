package com.example.h2file;

import lombok.extern.slf4j.Slf4j;
import model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import repository.PersonRepository;

@SpringBootApplication
@Slf4j
public class H2FileApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(H2FileApplication.class, args);
		PersonRepository personRepository = configurableApplicationContext.getBean(PersonRepository.class);
		Person person = new Person("Chris", "Anderson",32);
		personRepository.save(person);

	}

}
