package com.JavaExercicesForLinkedRH.LinkedCrud.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@NoArgsConstructor
@Getter
@Setter
public class Class {
    private int classId;
    private Date start;
    private Date ending;
    private String locality;
    private Course course;

    public Class(int id, Date start, Date ending, String locality, Course course) {
        this.classId = id;
        this.start = start;
        this.ending = ending;
        this.locality = locality;
        this.course = course;
    }
}
