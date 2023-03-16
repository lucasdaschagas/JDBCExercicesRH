DROP TABLE IF EXISTS Cursos;
DROP TABLE IF EXISTS Employees;
DROP TABLE IF EXISTS Class;

CREATE TABLE Course(
Id int NOT NULL AUTO_INCREMENT,
Name varchar(100) not null,
Description varchar(4000) not null,
Duration int not null);

CREATE TABLE Employees(
Id int NOT NULL AUTO_INCREMENT,
Name varchar(200) not null,
CPF char(11) not null,
Birthday date not null,
Role varchar(200) not null,
Admission date not null,
Status bit not null);

CREATE TABLE Class(
Id int primary key NOT NULL AUTO_INCREMENT,
Start date not null
Ending date not null
Locality varchar(200)
Course_Id int
<<<<<<< HEAD:src/main/resources/schema.sql
  PRIMARY KEY (Id)
  FOREIGN KEY (Course_Id) REFERENCES Course(Id)
=======

>>>>>>> test:src/main/resources/Schema.sql
 );

