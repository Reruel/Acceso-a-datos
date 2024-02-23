DROP DATABASE IF EXISTS hospital;
CREATE DATABASE hospital;
USE hospital;

CREATE TABLE pacientes(id INT auto_increment PRIMARY KEY,
nombre VARCHAR(30),
apellidos VARCHAR(50),
ciudad VARCHAR(30),
direccion VARCHAR(50),
telefono INT,
edad INT, 
historial VARCHAR(100));


CREATE TABLE medicos(id INT auto_increment PRIMARY KEY,
nombre VARCHAR(30),
apellidos VARCHAR(50),
especialidad VARCHAR(30));


CREATE TABLE citas(id INT auto_increment PRIMARY KEY,
id_paciente INT,
id_medico INT,
fecha DATE,
hora VARCHAR(10),
FOREIGN KEY (id_paciente) REFERENCES pacientes(id),
FOREIGN KEY (id_medico) REFERENCES medicos(id));


 