package com.example.h2file;

import com.example.h2file.model.basic.Person;
import com.example.h2file.model.onetomanyunidirectional.Student;
import com.example.h2file.model.onetomanyunidirectional.University;
import com.example.h2file.model.onetooneunidirectional.Address;
import com.example.h2file.model.onetooneunidirectional.User;
import com.example.h2file.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
@Slf4j
public class H2FileApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(H2FileApplication.class, args);

//		basico
		/*PersonRepository personRepository = configurableApplicationContext.getBean(PersonRepository.class);
		Person myPerson = new Person("John", "Doe");
		personRepository.save(myPerson);*/

//		onetoone bidireccional
		/*CarRepository carRepository = configurableApplicationContext.getBean(CarRepository.class);
		OwnerRepository ownerRepository = configurableApplicationContext.getBean(OwnerRepository.class);
		Car car = new Car("m200");
		carRepository.save(car);

		Owner owner = new Owner("John Doe");
		owner.setCar(car);
		ownerRepository.save(owner);

		Optional<Car> optionalCar = carRepository.findById(1L);
		Optional<Owner>  optionalOwner = ownerRepository.findById(2L);

		if(optionalCar.isPresent() && optionalOwner.isPresent()){
			log.info(optionalCar.get() + " is owned by: "+ optionalCar.get().getOwner());
			log.info(optionalOwner.get()+ " has a car: "+ optionalOwner.get().getCar());
		}*/

//		onetoone unidireccional
		/*AddressRepository addressRepository = configurableApplicationContext.getBean(AddressRepository.class);
		UserRepository userRepository = configurableApplicationContext.getBean(UserRepository.class);

		Address address = new Address("home st.");
		addressRepository.save(address);

		User user = new User("John Doe", address);
		userRepository.save(user);*/

//		onetomany unidireccional
		/*UniversityRepository universityRepository = configurableApplicationContext.getBean(UniversityRepository.class);
		StudentRepository studentRepository = configurableApplicationContext.getBean(StudentRepository.class);

		Student firstStudent = new Student("1111");
		Student secondStudent = new Student("1112");
		Student thirdStudent = new Student("1113");
		studentRepository.save(thirdStudent);
		List<Student> students = List.of(firstStudent,secondStudent);
		University university = new University("Uoc", students);
		universityRepository.save(university);
		universityRepository.delete(university);*/

	}

}
