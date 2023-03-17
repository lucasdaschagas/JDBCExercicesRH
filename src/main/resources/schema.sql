USE javaexercices;

CREATE TABLE Course(
Course_Id int NOT NULL AUTO_INCREMENT,
Name varchar(100) not null,
Description varchar(4000) not null,
Duration int not null);

CREATE TABLE Employees(
Employees_Id int NOT NULL AUTO_INCREMENT,
Name varchar(200) not null,
CPF char(11) not null,
Birthday date not null,
Role varchar(200) not null,
Admission date not null,
Status bit not null);

CREATE TABLE Class(
Class_Id int primary key NOT NULL AUTO_INCREMENT,
Start date not null,
Ending date not null,
Locality varchar(200),
Course int FOREIGN KEY REFERENCES Course(CourseId)
 );

 CREATE TABLE Class_Employees(
    Class_EmployeesID INT PRIMARY KEY NOT NULL,
    Class_Id FOREIGN KEY REFERENCES Class(Class_Id),
    Employees_Id FOREIGN KEY REFERENCES Employees(Employees_Id)

 );

