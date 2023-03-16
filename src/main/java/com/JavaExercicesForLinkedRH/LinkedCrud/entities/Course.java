package com.JavaExercicesForLinkedRH.LinkedCrud.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class Course {
    private int courseId;
    private String name;
    private String description;
    private int Duration;

    public Course(int id, String name, String description, int duration) {
        this.courseId = id;
        this.name = name;
        this.description = description;
        Duration = duration;
    }
}
