package com.JavaExercicesForLinkedRH.LinkedCrud.exceptions;

import com.JavaExercicesForLinkedRH.LinkedCrud.entities.Course;

public class CourseAlreadyExistsException extends RuntimeException{

    public CourseAlreadyExistsException(Course id){
        super("Object " + id.getName() + " Already exists, please, insert another name ");

    }

}
