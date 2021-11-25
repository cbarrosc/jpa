package com.example.h2file;

import com.example.h2file.model.Student;
import com.example.h2file.model.University;
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

		UniversityRepository universityRepository = configurableApplicationContext.getBean(UniversityRepository.class);
		StudentRepository studentRepository = configurableApplicationContext.getBean(StudentRepository.class);

		Student firstStudent = new Student("1111");
		Student secondStudent = new Student("1112");
		Student thirdStudent = new Student("1113");
		studentRepository.save(thirdStudent);
		List<Student> students = List.of(firstStudent,secondStudent);
		University university = new University("Uoc", students);
		universityRepository.save(university);
		universityRepository.delete(university);

	}

}
