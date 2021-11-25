package com.example.h2file;

import com.example.h2file.model.Stream;
import com.example.h2file.model.Viewer;
import com.example.h2file.repository.StreamRepository;
import com.example.h2file.repository.ViewerRepository;
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
		StreamRepository streamRepository = configurableApplicationContext.getBean(StreamRepository.class);
		ViewerRepository viewerRepository = configurableApplicationContext.getBean(ViewerRepository.class);

		Viewer johnViewer = new Viewer("John12");
		Viewer willViewer = new Viewer("WillM2");
		Viewer samViewer = new Viewer("MightySam ");
		List<Viewer> viewers = List.of(johnViewer,willViewer,samViewer);


		Stream cookingStream = new Stream("CookingIsAwesome");
		Stream gamingStream = new Stream("ChillGaming");
		List<Stream> streams = List.of(cookingStream,gamingStream);

		streamRepository.saveAll(streams);
		johnViewer.followStream(cookingStream);
		willViewer.followStream(gamingStream);
		samViewer.followStream(gamingStream);
		samViewer.followStream(cookingStream);

		viewerRepository.saveAll(viewers);


	}

}
