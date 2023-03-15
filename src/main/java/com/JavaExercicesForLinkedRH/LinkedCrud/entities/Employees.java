package com.JavaExercicesForLinkedRH.LinkedCrud.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Getter
public class Employees {
    private int id;
    private String name;
    private String cpf;
    private Date birthday;
    private String role;
    private Date admission;
    private int status ;
}
