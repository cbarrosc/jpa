package com.example.h2file;

import com.example.h2file.model.Tank;
import com.example.h2file.model.Truck;
import com.example.h2file.repository.TankRepository;
import com.example.h2file.repository.TruckRepository;
import com.example.h2file.repository.VehicleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class H2FileApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(H2FileApplication.class, args);
		VehicleRepository tankRepository = configurableApplicationContext.getBean(TankRepository.class);
		VehicleRepository truckRepository = configurableApplicationContext.getBean(TruckRepository.class);

		Tank myTank = new Tank("T-150",5,500);
		Truck myTruck = new Truck("200M",2,36,true);
		tankRepository.save(myTank);
		truckRepository.save(myTruck);

	}

}
