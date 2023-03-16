package com.JavaExercicesForLinkedRH.LinkedCrud.repository;

import com.JavaExercicesForLinkedRH.LinkedCrud.entities.Employees;

import java.util.List;
import java.util.Optional;

public interface EmployeesRepository {
     List<Employees> employees();
     void create(Employees employees);
     Optional<Employees> getEmployees(int id);
     void update (Employees employees, int id);
     void delete(int id);
}

