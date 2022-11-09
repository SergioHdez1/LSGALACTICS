create schema if not exists Automotora_schema;

create table `automotora_schema`.`producto` (
`producto_id` int not null auto_increment,
`nombreProducto` varchar(20) not null,
`precioProducto` int not null,
`marca` varchar(20) not null,
`tipoProducto` varchar(20) not null,
`modelo` varchar(20) not null,
primary key (`producto_id`));

create table `automotora_schema`.`cliente` (
`cliente_id` int not null auto_increment,
`nombre` varchar(30) not null,
`rut` varchar(15) not null,
`correo` varchar(30) not null,
primary key (`cliente_id`));

create table `automotora_schema`.`vendedor` (
`vendedor_id` int not null auto_increment,
`nombreVendedor` varchar(30) not null,
primary key (`vendedor_id`));

create table `automotora_schema`.`historialVendedor` (
`historialVendedor_id` int not null auto_increment,
primary key (`historialVendedor_id`));

create table `automotora_schema`.`historialCliente` (
`historialCliente_id` int not null auto_increment,
primary key (`historialCliente_id`));

create table `automotora_schema`.`orden` (
`orden_id` int not null auto_increment,
`financiamiento` varchar(20) not null,
`fecha` date not null,
primary key (`orden_id`));

#ALTER DE TABLA VENDEDOR
ALTER TABLE automotora_schema.vendedor ADD historialVendedor_id INT NOT NULL;
ALTER TABLE automotora_schema.vendedor ADD CONSTRAINT vendedorHistorialVendedor FOREIGN key(historialVendedor_id) REFERENCES automotora_schema.historialVendedor(historialVendedor_id);

#ALTER DE TABLA HISTORIAL VENDEDOR
ALTER TABLE automotora_schema.historialVendedor ADD orden_id INT NOT NULL;
ALTER TABLE automotora_schema.historialVendedor ADD CONSTRAINT historialVendedorOrden FOREIGN key(orden_id) REFERENCES automotora_schema.orden(orden_id);

#ALTER DE TABLA HISTORIAL CLIENTE
ALTER TABLE automotora_schema.historialCliente ADD orden_id INT NOT NULL;
ALTER TABLE automotora_schema.historialCliente ADD CONSTRAINT historialClienteOrden FOREIGN key(orden_id) REFERENCES automotora_schema.orden(orden_id);
ALTER TABLE automotora_schema.historialCliente ADD cliente_id INT NOT NULL;
ALTER TABLE automotora_schema.historialCliente ADD CONSTRAINT historialClienteCliente FOREIGN key(cliente_id) REFERENCES automotora_schema.cliente(cliente_id);

#ALTER DE TABLA ORDEN
ALTER TABLE automotora_schema.orden ADD producto_id INT NOT NULL;
ALTER TABLE automotora_schema.orden ADD CONSTRAINT ordenProducto FOREIGN key(producto_id) REFERENCES automotora_schema.producto(producto_id);
ALTER TABLE automotora_schema.orden ADD cliente_id INT NOT NULL;
ALTER TABLE automotora_schema.orden ADD CONSTRAINT ordenCliente FOREIGN key(cliente_id) REFERENCES automotora_schema.cliente(cliente_id);
ALTER TABLE automotora_schema.orden ADD vendedor_id INT NOT NULL;
ALTER TABLE automotora_schema.orden ADD CONSTRAINT ordenVendedor FOREIGN key(vendedor_id) REFERENCES automotora_schema.vendedor(vendedor_id);