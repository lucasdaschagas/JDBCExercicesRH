package com.JavaExercicesForLinkedRH.LinkedCrud.config;

import com.JavaExercicesForLinkedRH.LinkedCrud.entities.Course;
import com.JavaExercicesForLinkedRH.LinkedCrud.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    CourseService repo;

    @Override
    public void run(String... args) throws Exception {


        Course odontologia = new Course(null, "Odontologia", "Curso de medicina dentária",90);
        repo.create(odontologia);


    }
}
