package com.JavaExercicesForLinkedRH.LinkedCrud.service;
import com.JavaExercicesForLinkedRH.LinkedCrud.repository.ClassRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;

public class ClassService implements ClassRepository {
    private static final Logger logger = LoggerFactory.getLogger(ClassService.class);
    private JdbcTemplate jdbcTemplate;

    public ClassService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List classes() {
        return null;
    }

    @Override
    public void create(Object classes) {

    }

    @Override
    public Optional getClass(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Object classes, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
