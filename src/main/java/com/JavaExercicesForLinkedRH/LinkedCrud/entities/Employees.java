package com.JavaExercicesForLinkedRH.LinkedCrud.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Employees {
    private int emplooyeesId;
    private String name;
    private String cpf;
    private Date birthday;
    private String role;
    private Date admission;
    private int status ;

    public Employees(int id, String name, String cpf, Date birthday, String role, Date admission, int status) {
        this.emplooyeesId = id;
        this.name = name;
        this.cpf = cpf;
        this.birthday = birthday;
        this.role = role;
        this.admission = admission;
        this.status = status;
    }
}
