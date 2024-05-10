
INSERT INTO continent (name, code) VALUES ('América', 'AM');

INSERT INTO continent (name, code) VALUES ('Europa', 'EU');

INSERT INTO continent (name, code) VALUES ('África', 'AF');


INSERT INTO country (name, code, continent_id)
VALUES ('Estados Unidos', 'US', 1);

INSERT INTO country (name, code, continent_id)
VALUES ('Canadá', 'CA', 1);

INSERT INTO country (name, code, continent_id)
VALUES ('España', 'ES', 2);

INSERT INTO country (name, code, continent_id)
VALUES ('Colombia', 'CO', 1);

INSERT INTO country (name, code, continent_id)
VALUES ('Argentina', 'FR', 1);

INSERT INTO country (name, code, continent_id)
VALUES ('Francia', 'FR', 2);


INSERT INTO departament (name, code, country_id)
VALUES ('Antioquia', 'ANT', 4);

INSERT INTO departament (name, code, country_id)
VALUES ('Cundinamarca', 'CUN', 4);

INSERT INTO departament (name, code, country_id)
VALUES ('Buenos Aires', 'BA', 5);

INSERT INTO departament (name, code, country_id)
VALUES ('California', 'CA', 1);

INSERT INTO departament (name, code, country_id)
VALUES ('Île-de-France', 'IDF', 6);


INSERT INTO city (name, code, department_id)
VALUES ('Medellín', 'MED', 1);
 INSERT INTO city (name, code, department_id)
VALUES ('Bogotá', 'BOG', 2);

INSERT INTO city (name, code, department_id)
VALUES ('Buenos Aires', 'BA', 3);

INSERT INTO city (name, code, department_id)
VALUES ('Los Angeles', 'LA',  4);

INSERT INTO city (name, code, department_id)
VALUES ('San Francisco', 'SF',  4);

INSERT INTO city (name, code, department_id)
VALUES ('París', 'PAR',  5);



-- PERSON

INSERT INTO person (id, first_name, last_name, email, phone, date_birth, type_document, number_document, gender, address, city_id)
VALUES (1, 'Juan', 'Pérez', 'juan@example.com', '123456789', '1990-05-15', 'DNI', '12345678A', 'Masculino', 'Calle Principal 123', 4);

INSERT INTO person (id, first_name, last_name, email, phone, date_birth, type_document, number_document, gender, address, city_id)
VALUES (2, 'María', 'García', 'maria@example.com', '987654321', '1995-09-20', 'NIE', 'X1234567B', 'Femenino', 'Avenida Secundaria 456', 3);

INSERT INTO person (id, first_name, last_name, email, phone, date_birth, type_document, number_document, gender, address, city_id)
VALUES (3, 'Alejandro', 'Martínez', 'alejandro@example.com', '555123456', '1985-03-10', 'Pasaporte', 'AB123456', 'Masculino', 'Calle Sol 789', 2);

INSERT INTO person (id, first_name, last_name, email, phone, date_birth, type_document, number_document, gender, address, city_id)
VALUES (4, 'Ana', 'López', 'ana@example.com', '555987654', '1992-11-25', 'DNI', '87654321Z', 'Femenino', 'Avenida Principal 456', 2);

INSERT INTO person (id, first_name, last_name, email, phone, date_birth, type_document, number_document, gender, address, city_id)
VALUES (5, 'Carlos', 'Gómez', 'carlos@example.com', '555333444', '1980-08-18', 'NIE', 'Y7654321C', 'Masculino', 'Calle Central 321', 1);

-- USER
INSERT INTO user (username, password, person_id)
VALUES ('Admin', 'clave123', 1);

INSERT INTO user (username, password, person_id)
VALUES ('usuario2', 'contraseña456', 2);

INSERT INTO user (username, password, person_id)
VALUES ('usuario3', 'password789', 3);

INSERT INTO user (username, password, person_id)
VALUES ('usuario4', 'qwerty123', 4);

INSERT INTO user (username, password, person_id)
VALUES ('usuario5', 'abc123', 5);


-- ROLE
INSERT INTO role (name, description)
VALUES ('Administrador de Contenido', 'Responsable de administrar y mantener el contenido del sistema.');

INSERT INTO role (name, description)
VALUES ('Moderador', 'Encargado de supervisar y gestionar el contenido generado por los usuarios.');

INSERT INTO role (name, description)
VALUES ('Analista', 'Responsable de analizar datos y generar informes sobre el uso del sistema.');

INSERT INTO role (name, description)
VALUES ('Cliente', 'Usuarios que acceden al sistema como clientes o consumidores de servicios.');

INSERT INTO role (name, description)
VALUES ('Invitado', 'Usuarios que no han iniciado sesión en el sistema, con acceso limitado.');



-- VIEW
INSERT INTO view (name, route, description) VALUES ('Continent', '/continent', 'Continent Module');
INSERT INTO view (name, route, description) VALUES ('Country', '/country', 'Country Module');
INSERT INTO view (name, route, description) VALUES ('Departament', '/departament', 'Departament Module');
INSERT INTO view (name, route, description) VALUES ('City', '/city', 'City Module');

INSERT INTO view (name, route, description) VALUES ('Client', '/client', 'Client Module');
INSERT INTO view (name, route, description) VALUES ('Inventory', '/inventory', 'Inventory Module');
INSERT INTO view (name, route, description) VALUES ('InventoryDetail', '/inventory-detail', 'Inventory Detail Module');
INSERT INTO view (name, route, description) VALUES ('Invoice', '/invoice', 'Invoice Module');
INSERT INTO view (name, route, description) VALUES ('InvoiceDetail', '/invoice-detail', 'Invoice Detail Module');
INSERT INTO view (name, route, description) VALUES ('Product', '/product', 'Product Module');
INSERT INTO view (name, route, description) VALUES ('Supply', '/supply', 'Supply Module');
INSERT INTO view (name, route, description) VALUES ('SupplyProducto', '/supply-product', 'Supply Product Module');
INSERT INTO view (name, route, description) VALUES ('UnitMeasurement', '/unit-measurement', 'Unit Measurement Module');

INSERT INTO view (name, route, description) VALUES ('Module', '/module', 'Module Module'); -- Un poco redundante :)
INSERT INTO view (name, route, description) VALUES ('ModuleView', '/module-view', 'Module View Module');
INSERT INTO view (name, route, description) VALUES ('User', '/user', 'User Module');
INSERT INTO view (name, route, description) VALUES ('UserRole', '/user-role', 'User Role Module');
INSERT INTO view (name, route, description) VALUES ('View', '/view', 'View Module');
INSERT INTO view (name, route, description) VALUES ('RoleView', '/role-view', 'Role view Module');
INSERT INTO view (name, route, description) VALUES ('Role', '/role', 'role Module');
INSERT INTO view (name, route, description) VALUES ('Person', '/person', 'person Module');



-- MODULE
INSERT INTO module (name, description) VALUES ('Security', 'Module of security');
INSERT INTO module (name, description) VALUES ('Ubication', 'Module of ubication');
INSERT INTO module (name, description) VALUES ('Operational', 'Module of logic bussiness ');


-- MODULE-VIEW

INSERT INTO module_view (module_id, view_id) VALUES (2, 1);
INSERT INTO module_view (module_id, view_id) VALUES (2, 2);
INSERT INTO module_view (module_id, view_id) VALUES (2, 3);
INSERT INTO module_view (module_id, view_id) VALUES (2, 4);

INSERT INTO module_view (module_id, view_id) VALUES (3, 5);
INSERT INTO module_view (module_id, view_id) VALUES (3, 6);
INSERT INTO module_view (module_id, view_id) VALUES (3, 7);
INSERT INTO module_view (module_id, view_id) VALUES (3, 8);
INSERT INTO module_view (module_id, view_id) VALUES (3, 9);
INSERT INTO module_view (module_id, view_id) VALUES (3, 10);
INSERT INTO module_view (module_id, view_id) VALUES (3, 11);
INSERT INTO module_view (module_id, view_id) VALUES (3, 12);
INSERT INTO module_view (module_id, view_id) VALUES (3, 13);

-- Relacionar las vistas con el módulo de Seguridad
INSERT INTO module_view (module_id, view_id) VALUES (1, 14);
INSERT INTO module_view (module_id, view_id) VALUES (1, 15);
INSERT INTO module_view (module_id, view_id) VALUES (1, 16);
INSERT INTO module_view (module_id, view_id) VALUES (1, 17);
INSERT INTO module_view (module_id, view_id) VALUES (1, 18);
INSERT INTO module_view (module_id, view_id) VALUES (1, 19);
INSERT INTO module_view (module_id, view_id) VALUES (1, 20);
INSERT INTO module_view (module_id, view_id) VALUES (1, 21);

-- USER-ROLE
-- Asignar un rol a un usuario específico
INSERT INTO user_role (user_id, role_id) VALUES (1, 1);

INSERT INTO user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO user_role (user_id, role_id) VALUES (3, 1);

INSERT INTO user_role (user_id, role_id) VALUES (4, 1);
INSERT INTO user_role (user_id, role_id) VALUES (4, 2);

INSERT INTO user_role (user_id, role_id) VALUES (5, 3);



-- ROLE-VIEW
INSERT INTO role_view (role_id, view_id) VALUES (1, 1); -- Administrador de Contenido con Vista de Continent
INSERT INTO role_view (role_id, view_id) VALUES (1, 2); -- Administrador de Contenido con Vista de Country
INSERT INTO role_view (role_id, view_id) VALUES (1, 3); -- Administrador de Contenido con Vista de Departament
INSERT INTO role_view (role_id, view_id) VALUES (1, 4); -- Administrador de Contenido con Vista de City
INSERT INTO role_view (role_id, view_id) VALUES (2, 2); -- Moderador con Vista de Country
INSERT INTO role_view (role_id, view_id) VALUES (2, 3); -- Moderador con Vista de Departament
INSERT INTO role_view (role_id, view_id) VALUES (2, 4); -- Moderador con Vista de City
INSERT INTO role_view (role_id, view_id) VALUES (3, 5); -- Analista con Vista de Client
INSERT INTO role_view (role_id, view_id) VALUES (3, 6); -- Analista con Vista de Inventory
INSERT INTO role_view (role_id, view_id) VALUES (3, 7); -- Analista con Vista de InventoryDetail
INSERT INTO role_view (role_id, view_id) VALUES (3, 8); -- Analista con Vista de Invoice
INSERT INTO role_view (role_id, view_id) VALUES (3, 9); -- Analista con Vista de InvoiceDetail
INSERT INTO role_view (role_id, view_id) VALUES (3, 10); -- Analista con Vista de Product
INSERT INTO role_view (role_id, view_id) VALUES (3, 11); -- Analista con Vista de Supply
INSERT INTO role_view (role_id, view_id) VALUES (3, 12); -- Analista con Vista de SupplyProducto
INSERT INTO role_view (role_id, view_id) VALUES (3, 13); -- Analista con Vista de UnitMeasurement
INSERT INTO role_view (role_id, view_id) VALUES (3, 14); -- Analista con Vista de Module
INSERT INTO role_view (role_id, view_id) VALUES (3, 15); -- Analista con Vista de ModuleView
INSERT INTO role_view (role_id, view_id) VALUES (3, 16); -- Analista con Vista de User
INSERT INTO role_view (role_id, view_id) VALUES (3, 17); -- Analista con Vista de UserRole
INSERT INTO role_view (role_id, view_id) VALUES (3, 18); -- Analista con Vista de View

-- Unit-Measure
-- Insertar datos de unidades de medida
INSERT INTO unit_measurement (name, code) VALUES ('Kilogramo', 'KG');
INSERT INTO unit_measurement (name, code) VALUES ('Litro', 'L');
INSERT INTO unit_measurement (name, code) VALUES ('Metro', 'M');
INSERT INTO unit_measurement (name, code) VALUES ('Unidad', 'UN');



-- CLIENT
-- Insertar un cliente asociado a la persona con ID 1 y código "C001"
INSERT INTO client (code, person_id)
VALUES ('C001', 1);

-- Insertar otro cliente asociado a la persona con ID 2 y código "C002"
INSERT INTO client (code, person_id)
VALUES ('C002', 2);

-- Insertar otro cliente asociado a la persona con ID 3 y código "C003"
INSERT INTO client (code, person_id)
VALUES ('C003', 3);

-- Insertar otro cliente asociado a la persona con ID 4 y código "C004"
INSERT INTO client (code, person_id)
VALUES ('C004', 4);

-- Insertar otro cliente asociado a la persona con ID 5 y código "C005"
INSERT INTO client (code, person_id)
VALUES ('C005', 5);



-- Inventory
-- Insertar datos de inventario
INSERT INTO inventory (name, code) VALUES ('Almacén principal', 'ALM001');
INSERT INTO inventory (name, code) VALUES ('Almacén de sucursal A', 'ALM002');
INSERT INTO inventory (name, code) VALUES ('Almacén de sucursal B', 'ALM003');

-- SUPPLY
-- Insertar datos de suministros
INSERT INTO supply (name, code, unit_measurement_id) VALUES ('Tornillos de acero inoxidable', 'TS001', 4);
INSERT INTO supply (name, code, unit_measurement_id) VALUES ('Tubería de PVC de 2 pulgadas', 'TPVC002', 3);
INSERT INTO supply (name, code, unit_measurement_id) VALUES ('Cable eléctrico de 10mm', 'CE010', 3);
INSERT INTO supply (name, code, unit_measurement_id) VALUES ('Pintura blanca mate', 'PB001', 2);
INSERT INTO supply (name, code, unit_measurement_id) VALUES ('Bombillas LED de 60W', 'BL060', 4);

-- INVENTORY-DETAIL
-- Insertar detalles de inventario
-- Suponiendo que el suministro con ID 1 se encuentra en el inventario con ID 1
INSERT INTO inventory_detail (supply_id, inventory_id) VALUES (1, 1);

-- Suponiendo que el suministro con ID 2 se encuentra en el inventario con ID 2
INSERT INTO inventory_detail (supply_id, inventory_id) VALUES (2, 2);

-- Suponiendo que el suministro con ID 3 se encuentra en el inventario con ID 1
INSERT INTO inventory_detail (supply_id, inventory_id) VALUES (3, 1);

-- Suponiendo que el suministro con ID 4 se encuentra en el inventario con ID 3
INSERT INTO inventory_detail (supply_id, inventory_id) VALUES (4, 3);

-- INVOICE
-- Insertar datos de factura
INSERT INTO invoice (total, client_id) VALUES (100.50, 1); -- Factura con un total de 100.50 asociada al cliente con ID 1
INSERT INTO invoice (total, client_id) VALUES (150.75, 2); -- Factura con un total de 150.75 asociada al cliente con ID 2
INSERT INTO invoice (total, client_id) VALUES (200.00, 3); -- Factura con un total de 200.00 asociada al cliente con ID 3

-- Insertar datos de productos
INSERT INTO product (name, description, code, price) VALUES ('Producto A', 'Descripción del Producto A', 'PA001', 50.00);
INSERT INTO product (name, description, code, price) VALUES ('Producto B', 'Descripción del Producto B', 'PB002', 75.00);
INSERT INTO product (name, description, code, price) VALUES ('Producto C', 'Descripción del Producto C', 'PC003', 100.00);

-- Suponiendo que el Producto A está compuesto por el Suministro 1 y el Suministro 2
INSERT INTO supply_product (product_id, supply_id) VALUES (1, 1); -- Asociar Producto A con Suministro 1
INSERT INTO supply_product (product_id, supply_id) VALUES (1, 2); -- Asociar Producto A con Suministro 2

-- Suponiendo que el Producto B está compuesto por el Suministro 3
INSERT INTO supply_product (product_id, supply_id) VALUES (2, 3); -- Asociar Producto B con Suministro 3

-- Suponiendo que el Producto C está compuesto por el Suministro 4 y el Suministro 5
INSERT INTO supply_product (product_id, supply_id) VALUES (3, 4); -- Asociar Producto C con Suministro 4
INSERT INTO supply_product (product_id, supply_id) VALUES (3, 5); -- Asociar Producto C con Suministro 5

-- Supongamos que el producto con ID 1 se vendió en la factura con ID 1 y la cantidad es 5
INSERT INTO invoice_detail (product_id, invoice_id, quantity) VALUES (1, 1, 5);

-- Supongamos que el producto con ID 2 se vendió en la factura con ID 2 y la cantidad es 3
INSERT INTO invoice_detail (product_id, invoice_id, quantity) VALUES (2, 2, 3);

-- Supongamos que el producto con ID 3 se vendió en la factura con ID 1 y la cantidad es 2.5
INSERT INTO invoice_detail (product_id, invoice_id, quantity) VALUES (3, 1, 2.5);


