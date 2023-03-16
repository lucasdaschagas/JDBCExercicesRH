package com.JavaExercicesForLinkedRH.LinkedCrud.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@Getter
public class EmployersClass {

    private int id;
    private List<Employees> employees = new ArrayList<>();
    private List<Class> classes = new ArrayList<>();


}
