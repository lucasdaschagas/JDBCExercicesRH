package com.JavaExercicesForLinkedRH.LinkedCrud.service;

import com.JavaExercicesForLinkedRH.LinkedCrud.entities.Course;
import com.JavaExercicesForLinkedRH.LinkedCrud.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;

public class CourseService implements CourseRepository {
    private static final Logger logger = LoggerFactory.getLogger(CourseService.class);
    private JdbcTemplate jdbcTemplate;

    public CourseService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Course> courses() {
        return null;
    }

    @Override
    public void create(Course course) {

    }

    @Override
    public Optional<Course> getCourses(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
