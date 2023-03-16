package com.JavaExercicesForLinkedRH.LinkedCrud.service;

import com.JavaExercicesForLinkedRH.LinkedCrud.entities.Course;
import com.JavaExercicesForLinkedRH.LinkedCrud.entities.Employees;
import com.JavaExercicesForLinkedRH.LinkedCrud.repository.EmployeesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.Optional;

public class EmployeesService implements EmployeesRepository {
    private static final Logger logger = LoggerFactory.getLogger(EmployeesService.class);
    private JdbcTemplate jdbcTemplate;

    RowMapper<Course> rowMapper = ((rs, rowNum) -> {
        Course course = new Course();
        course.setCourseId(rs.getInt("Course_Id"));
        course.setName(rs.getString("Name"));
        course.setDescription(rs.getString("Description"));
        course.setDuration(rs.getInt("Duration"));
        return course;
    });

    public EmployeesService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Employees> employees() {
        return null;
    }

    @Override
    public void create(Employees employees) {

    }

    @Override
    public Optional<Employees> getEmployees(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Employees employees, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
