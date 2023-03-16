package com.JavaExercicesForLinkedRH.LinkedCrud.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.*;

@NoArgsConstructor
@Getter
public class Class {
    private int id;
    private Date start;
    private Date ending;
    private String locality;
    private List<EmployersClass> employersGroup = new ArrayList<>();



}
