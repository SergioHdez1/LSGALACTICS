INSERT INTO automotora_schema.cliente (nombre, rut, correo) VALUES ('benja', '213456789-9','correo@correo.correo');
INSERT INTO automotora_schema.cliente (nombre, rut, correo) VALUES ('ivan', '567657245-9','email@email.email');
INSERT INTO automotora_schema.cliente (nombre, rut, correo) VALUES ('sergio', '111222333-9','gmail@gmail.gmail');


INSERT INTO automotora_schema.producto (nombreProducto, precioProducto, marca, tipoProducto, Modelo) VALUES ('aifon15',1990000,'apple','telefono','slim');
INSERT INTO automotora_schema.producto (nombreProducto, precioProducto, marca, tipoProducto, Modelo) VALUES ('blunt',5000,'fino','weed','');
#como cambiar una columna de not null, a null
INSERT INTO automotora_schema.producto (nombreProducto, precioProducto, marca, tipoProducto, Modelo) VALUES ('super8',150,'mckay','comida', 'super8');

INSERT INTO automotora_schema.vendedor (nombreVendedor) values ('tio Horacio');
INSERT INTO automotora_schema.vendedor (nombreVendedor) values ('tony pulgita');

INSERT INTO automotora_schema.orden (financiamiento, fecha, producto_id, cliente_id, vendedor_id) values ('credito', '2022-05-21', 1,1,2);
INSERT INTO automotora_schema.orden (financiamiento, fecha, producto_id, cliente_id, vendedor_id) values ('efectivo', '2022-09-11', 2,2,3);
INSERT INTO automotora_schema.orden (financiamiento, fecha, producto_id, cliente_id, vendedor_id) values ('debito', '2002-05-03', 3,3,2);

INSERT INTO automotora_schema.historialVendedor (orden_id, vendedor_id) values (1,2);
INSERT INTO automotora_schema.historialVendedor (orden_id, vendedor_id) values (2,3);
INSERT INTO automotora_schema.historialVendedor (orden_id, vendedor_id) values (3,2);

insert into automotora_schema.historialCliente (orden_id, cliente_id) values (1,1);
insert into automotora_schema.historialCliente (orden_id, cliente_id) values (2,2);
insert into automotora_schema.historialCliente (orden_id, cliente_id) values (3,3);