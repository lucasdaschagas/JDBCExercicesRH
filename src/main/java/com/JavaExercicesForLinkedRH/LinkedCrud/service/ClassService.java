package com.JavaExercicesForLinkedRH.LinkedCrud.service;
import com.JavaExercicesForLinkedRH.LinkedCrud.entities.Class;
import com.JavaExercicesForLinkedRH.LinkedCrud.entities.Course;
import com.JavaExercicesForLinkedRH.LinkedCrud.repository.ClassRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassService implements ClassRepository {
    private static final Logger logger = LoggerFactory.getLogger(ClassService.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    RowMapper<Class> rowMapper = ((rs, rowNum) -> {
        Class classes = new Class();
        classes.setClassId(rs.getInt("Class_Id"));
        classes.setStart(rs.getDate("Start"));
        classes.setEnding(rs.getDate("Ending"));
        classes.setLocality(rs.getString("Locality"));

        return classes;
    });

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
