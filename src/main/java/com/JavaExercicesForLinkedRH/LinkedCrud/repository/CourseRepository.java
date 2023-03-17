package com.JavaExercicesForLinkedRH.LinkedCrud.repository;

import com.JavaExercicesForLinkedRH.LinkedCrud.entities.Course;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository {
    List<Course> courses();

    void create(Course course);

    Optional<Course> getCourses(int id);

    void update(Course course, int id);

    void delete(int id);
}

