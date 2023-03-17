package com.JavaExercicesForLinkedRH.LinkedCrud.config;

import com.JavaExercicesForLinkedRH.LinkedCrud.entities.Course;
import com.JavaExercicesForLinkedRH.LinkedCrud.repository.CourseRepository;
import com.JavaExercicesForLinkedRH.LinkedCrud.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private CourseService repository;

    @Override
    public void run(String... args) throws Exception {
//        Course odonto = new Course("CursoA", "Cursob", 90 );
//        repository.create(odonto);
//        repository.getCoursesById(1);


    }
}
