package com.JavaExercicesForLinkedRH.LinkedCrud.repository;

import java.util.List;
import java.util.Optional;

public interface ClassRepository<Class> {
     List<Class> classes();

    void create(Class classes);

    Optional<Class> getClass(int id);

     void update (Class classes, int id);
     void delete(int id);
 }
