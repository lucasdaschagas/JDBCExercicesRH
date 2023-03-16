DROP TABLE IF EXISTS Cursos;
DROP TABLE IF EXISTS Employees;
DROP TABLE IF EXISTS Class;

CREATE TABLE Course(
CourseId int NOT NULL AUTO_INCREMENT,
Name varchar(100) not null,
Description varchar(4000) not null,
Duration int not null);

CREATE TABLE Employees(
EmployeesId int NOT NULL AUTO_INCREMENT,
Name varchar(200) not null,
CPF char(11) not null,
Birthday date not null,
Role varchar(200) not null,
Admission date not null,
Status bit not null);

CREATE TABLE Class(
ClassId int primary key NOT NULL AUTO_INCREMENT,
Start date not null,
Ending date not null,
Locality varchar(200),
Course int FOREIGN KEY REFERENCES Course(CourseId)
 );

 CREATE TABLE Class_Employees(
    Class_EmployeesID INT PRIMARY KEY NOT NULL,
    ClassId FOREIGN KEY REFERENCES Class(ClassId),
    EmployeesId FOREIGN KEY REFERENCES Employees(EmployeesId)

 );

