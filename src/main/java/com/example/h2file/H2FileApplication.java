package com.example.h2file;

import com.example.h2file.model.Archer;
import com.example.h2file.model.Infantry;
import com.example.h2file.model.InfantryType;
import com.example.h2file.model.Knight;
import com.example.h2file.repository.ArcherRepository;
import com.example.h2file.repository.InfantryRepository;
import com.example.h2file.repository.KnightRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class H2FileApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(H2FileApplication.class, args);
		InfantryRepository archerRepository = configurableApplicationContext.getBean(ArcherRepository.class);
		InfantryRepository knightRepository = configurableApplicationContext.getBean(KnightRepository.class);

		Infantry archer = new Archer(InfantryType.LIGHT,300,500,100,1000);
		Infantry knight = new Knight(InfantryType.HEAVY,280,1000,300,true);

		archerRepository.save(archer);
		knightRepository.save(knight);

		archerRepository.delete(archer);


	}

}
