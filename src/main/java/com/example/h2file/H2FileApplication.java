package com.example.h2file;

import com.example.h2file.model.Car;
import com.example.h2file.model.Owner;
import com.example.h2file.repository.CarRepository;
import com.example.h2file.repository.OwnerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
@Slf4j
public class H2FileApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(H2FileApplication.class, args);


//		onetoone bidireccional
		CarRepository carRepository = configurableApplicationContext.getBean(CarRepository.class);
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
		}


	}

}
