DROP DATABASE IF EXISTS bdReto;
CREATE DATABASE bdReto;
USE bdReto;

CREATE TABLE libro(id INT auto_increment PRIMARY KEY,
titulo VARCHAR(70),
precio DOUBLE,
editorial VARCHAR(50),
fecha_publicacion DATE);

CREATE TABLE autor(id INT auto_increment PRIMARY KEY,
nombre VARCHAR(70),
apellidos VARCHAR(50),
edad int);


CREATE TABLE categoria(id INT auto_increment PRIMARY KEY,
nombre VARCHAR(70));

CREATE TABLE cliente(id INT auto_increment PRIMARY KEY,
nombre VARCHAR(70),
apellidos VARCHAR(50),
edad INT,
direccion VARCHAR(50),
dni VARCHAR(15));


CREATE TABLE pedido(id INT auto_increment PRIMARY KEY,
fecha DATE,
id_cliente INT,
FOREIGN KEY (id_cliente) REFERENCES cliente(id));


-- TABLAS INTERMEDIAS
CREATE TABLE libro_autor(id INT auto_increment PRIMARY KEY,
id_libro INT,
id_autor INT, 
FOREIGN KEY (id_libro )REFERENCES libro(id),
FOREIGN KEY (id_autor) REFERENCES autor(id));

CREATE TABLE libro_categoria(id INT auto_increment PRIMARY KEY,
id_libro INT,
id_categoria INT, 
FOREIGN KEY (id_libro) REFERENCES libro(id),
FOREIGN KEY (id_categoria) REFERENCES categoria(id));

CREATE TABLE libro_pedido(id INT auto_increment PRIMARY KEY,
id_libro INT,
id_pedido INT, 
FOREIGN KEY (id_libro) REFERENCES libro(id),
FOREIGN KEY (id_pedido) REFERENCES pedido(id));

INSERT INTO autor(nombre,apellidos,edad) VALUES
('Pablo','Neruda',69),
('Joanne','Rowling',58),
('Florencia','Bonelli',52);

INSERT INTO categoria(nombre) VALUES
('Terror'),('Suspenso'),('Fantasía'),('Aventura'),('Romance');

INSERT INTO cliente(nombre,apellidos,edad,direccion,dni) VALUES
('Cesar','Diaz',35,'Malaga','123456'),
('Ricardo','Gonzalez',42,'Malaga','123444'),
('José','Perez',21,'Granada','165653'),
('Cintia ','Benitez',30,'Malaga','54678'),
('Susana ','Ruiz',25,'Sevilla','342134'),
('Cesar','Diaz',35,'Granada','798631');

INSERT INTO libro(titulo,precio,editorial,fecha_publicacion) VALUES
('El principito', 22.5, 'Berenice','1951-09-17');

