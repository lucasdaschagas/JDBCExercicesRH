CREATE TABLE Course(
Course_Id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
Name varchar(100) not null unique,
Description varchar(4000) not null,
Duration int not null);

CREATE TABLE Employees(
Employees_Id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
Name varchar(200) not null,
CPF char(11) not null,
Birthday date not null,
Role varchar(200) not null,
Admission date not null,
Status bit not null);

CREATE TABLE Class(
Class_Id int NOT NULL AUTO_INCREMENT,
Start date not null,
Ending date not null,
Locality varchar(200),
Course_Id int,
PRIMARY KEY (Class_Id),
FOREIGN KEY (Course_Id) REFERENCES Class(Class_Id)
);

 CREATE TABLE Class_Employees(
    Class_EmployeesID INT  NOT NULL PRIMARY KEY auto_increment,
    Class_Id int,
    Employees_Id int,
    FOREIGN KEY (Class_Id) REFERENCES Class(Class_Id),
    FOREIGN KEY (Employees_Id) REFERENCES Employees(Employees_Id)

 );
drop table Course,employees,class,class_employees;
Select * from course;
Select * from class;
Select * from employees;
Select * from class_employees;