drop database if exists phoneland;
create database phoneland;
use phoneland;

create table cliente(
idcliente int auto_increment primary key,
nombrecliente varchar (30) not null,
apellidocliente varchar (50) not null,
direccion varchar (100),
ciudad varchar (50),
provincia varchar (20),
cp varchar (10),
tipocliente varchar (20),
ingresos double,
fecha date
);

create table venta(
idventa int auto_increment primary key,
idcliente int,
idproducto int,
nombreventa varchar (30),
fechaventa date,
index idx_idcliente (idcliente),
index idx_idproducto (idproducto)
);

create table producto (
    idproducto INT AUTO_INCREMENT PRIMARY KEY,
    idfabricante int,
    nombreproducto VARCHAR(30),
    precio double
);

create table fabricante (
idfabricante int auto_increment primary key,
nombrefabricante varchar (30) not null,
tipoproducto enum ('Electrónica', 'Ropa', 'Alimentos', 'Muebles', 'Otros') not null,
caracteristicas set ('Calidad', 'PrecioCompetitivo', 'Variedad', 'ServicioPostventa')
);

alter table venta
add constraint fk_idcliente
foreign key idcliente (idcliente)
references cliente (idcliente);

alter table venta
add constraint fk_idproducto
foreign key idproductoe (idproducto)
references producto (idproducto);


insert into cliente (nombrecliente, apellidocliente, direccion, ciudad, provincia, cp, tipocliente, ingresos, 
fecha) values
('Alberto', 'Ruiz', 'Avenida Gandalf', 'Gondor', 'Tierra media', '29003', 'empresa', '9000.50',
'2023-01-15'),
('Laura', 'Perez', 'Calle Frodo', 'Bolson cerrado', 'La comarca', '28003', 'particular', '6000.75',
'2023-02-20'),
('Sauron', 'Gonzalez', 'Avenida maligna', 'Mordor city', 'Mordor', '38003', 'particular', '8000.75',
'2023-02-20'),
('Reyes', 'Rubio', 'Plaza aparejador', 'Malaga', 'Malaga', '29010', 'particular', 1200, '2023-10-6');

insert into producto (idfabricante, nombreproducto, precio) values
(1, 'Movil iPhone', 999.99),
(2, 'Movil Honor', 499.99),
(3, 'Movil Samsung', 799.99);

insert into venta (idcliente, idproducto, fechaventa)
VALUES
    (1, 1, '2023-01-10'),
    (2, 2, '2023-02-15'),
    (3, 3, '2023-03-20'),
    (1, 2, '2023-04-05'),
    (2, 1, '2023-05-10'),
    (3, 3, '2023-06-15');

select * from venta v
inner join cliente c on v.idcliente = c.idcliente; 

select * from cliente c
right join venta v on v.idcliente = c.idcliente;

select * from cliente c
left join venta v on v.idcliente = c.idcliente;

select * from cliente 
natural join venta;

select * from cliente
inner join venta using (idcliente); 

select * from venta v
inner join cliente c on v.idcliente = c.idcliente
inner join producto p on v.idproducto = p.idproducto
inner join fabricante f on v.idfabricante = p.idfabricante