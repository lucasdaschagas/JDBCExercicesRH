package com.JavaExercicesForLinkedRH.LinkedCrud.service;

import com.JavaExercicesForLinkedRH.LinkedCrud.entities.Course;
import com.JavaExercicesForLinkedRH.LinkedCrud.entities.Employees;
import com.JavaExercicesForLinkedRH.LinkedCrud.repository.EmployeesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeesService implements EmployeesRepository {
    private static final Logger logger = LoggerFactory.getLogger(EmployeesService.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    RowMapper<Employees> rowMapper = ((rs, rowNum) -> {
        Employees employees = new Employees();
        employees.setEmplooyeesId(rs.getInt("Employees_Id"));
        employees.setName(rs.getString("Name"));
        employees.setCpf(rs.getString("CPF"));
        employees.setBirthday(rs.getDate("Birthday"));
        employees.setRole(rs.getString("Role"));
        employees.setAdmission(rs.getDate("Admission"));
        employees.setStatus(rs.getInt("Status"));
        return employees;
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
