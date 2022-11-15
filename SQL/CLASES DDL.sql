CREATE SCHEMA IF NOT EXISTS generation_schema;
#ESTE ES UN COMENTARIO EN SQL :D#
CREATE TABLE `generation_schema`.`articulo`(
`articulo_id` INT NOT NULL AUTO_INCREMENT,
`nombre`  VARCHAR(20) NOT NULL,
`precio` INT NOT NULL,
PRIMARY KEY (`articulo_id`));

CREATE TABLE `generation_schema`.`cliente`(
`cliente_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR(20) NOT NULL,
`email` VARCHAR(40) NOT NULL,
`fechaNacimiento` DATE NOT NULL,
`rut` VARCHAR(15) NOT NULL,
PRIMARY KEY(`cliente_id`));

CREATE TABLE `generation_schema`.`historial`(
`historial_id` INT NOT NULL AUTO_INCREMENT,
`cliente_id` INT NOT NULL,
PRIMARY KEY (`historial_id`),
CONSTRAINT historialCliente FOREIGN KEY (cliente_id) REFERENCES generation_schema.cliente(cliente_id));

CREATE TABLE `generation_schema`.`envio`(
`envio_id` INT NOT NULL AUTO_INCREMENT,
`direccion` VARCHAR (50) NOT NULL,
`fecha` DATE NOT NULL,
`delivery_id` INT NOT NULL,
`cliente_id` INT NOT NULL,
PRIMARY KEY (`envio_id`),
CONSTRAINT envioDelivery FOREIGN KEY (delivery_id) REFERENCES generation_schema.delivery(delivery_id),
CONSTRAINT envioCliente FOREIGN KEY (cliente_id) REFERENCES generation_schema.cliente(cliente_id));

CREATE TABLE `generation_schema`.`delivery`(
`delivery_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR (20) NOT NULL,
`horario` DATETIME NOT NULL,
PRIMARY KEY (`delivery_id`));

CREATE TABLE `generation_schema`.`tarjeta`(
`tarjeta_id` INT NOT NULL AUTO_INCREMENT,
`banco` VARCHAR (30) NOT NULL,
`datos` INT NOT NULL,
`cliente_id` INT NOT NULL,
PRIMARY KEY (`tarjeta_id`),
CONSTRAINT tarjetaCliente FOREIGN KEY (cliente_id) REFERENCES generation_schema.cliente(cliente_id));

CREATE TABLE `generation_schema`.`orden`(
`orden_id` INT NOT NULL auto_increment,
`envio_id` INT NOT NULL,
`articulo_id` INT  NOT NULL,
`historial_id` INT NOT NULL,
primary key (`orden_id`),
CONSTRAINT ordenEnvio FOREIGN KEY (envio_id) REFERENCES generation_schema.envio(envio_id),
CONSTRAINT ordenArticulo FOREIGN KEY (articulo_id) REFERENCES generation_schema.articulo(articulo_id),
CONSTRAINT ordenHistorial FOREIGN KEY (historial_id) REFERENCES generation_schema.historial(historial_id));

#para FK
ALTER TABLE generation_schema.tarjeta ADD cliente_id INT NOT NULL;
ALTER TABLE generation_schema.tarjeta ADD CONSTRAINT tarjetaCliente FOREIGN KEY (cliente_id) REFERENCES generation_schema.cliente(cliente_id);

#para eliminar tablas SIN RELACIONES
DROP TABLE generation_schema.historial;

#para eliminar tablas CON relaciones
#primero borrar la FK CON EL NOMBRE DE LA FK
ALTER TABLE generation_schema.cliente DROP foreign key clienteHistorial;
ALTER TABLE generation_schema.historial DROP foreign key clienteHistorial;

DROP TABLE generation_schema.historial;

ALTER TABLE generation_schema.orden DROP foreign key ordenEnvio;