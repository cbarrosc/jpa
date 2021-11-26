package com.example.h2file;

import com.example.h2file.model.*;
import com.example.h2file.repository.ArtPieceRepository;
import com.example.h2file.repository.PaintingRepository;
import com.example.h2file.repository.SculptureRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class H2FileApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(H2FileApplication.class, args);
		ArtPieceRepository sculptureRepository = configurableApplicationContext.getBean(SculptureRepository.class);
		ArtPieceRepository paintingRepository = configurableApplicationContext.getBean(PaintingRepository.class);

		ArtPiece sculpture = new Sculpture("John Doe", Material.WOOD,200.2);
		ArtPiece painting = new Painting("Tom Smith", PaintingTechnique.OIL,25.5,44.9);

		sculptureRepository.save(sculpture);
		paintingRepository.save(painting);




	}

}
