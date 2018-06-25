insert into category (name, description, image_url, is_active) values ('Television', 'Television was nineteens most popular electronics device', 'cat_1', true);

insert into category (name, description, image_url, is_active) values ('Laptop', 'Laptop is a most popular device in present time, because you can use it anywhere where you want to use.', 'cat_2', true);

insert into category (name, description, image_url, is_active) values ('
Mobile', 'Mobile is also most popular device, because you can connect the world over the mobile. Its also called as Smart Phone', 'cat_3', true);

insert into user_detail (first_name, last_name, role, enabled, email, password) values ('Rashedul','Islam','admin',true, 'rashedulislam@yahoo.com','rashed');

insert into user_detail (first_name, last_name, role, enabled, email, password) values ('Iqbal','Uddin','supplier',true, 'iqbal@yahoo.com','iqbal');

insert into user_detail (first_name, last_name, role, enabled, email, password) values ('Junaki','Poki','supplier',true, 'poki@yahoo.com','junaki');

insert into product (name, brand, code, description, unit_price, category_id, supplier_id, quantity, is_active, purchases, view)
values ('Gallaxy s7','Samsung','SLDFKDSFLKSDGF','This is samsung companys description',5600.00, 3, 2,5, true);

insert into product (name, brand, code, description, unit_price, category_id, supplier_id, quantity, is_active, view, purchases)
values ('Macbook Pro','Apple','SDLSADKLAADKFS','This is apple companys description',110000.00, 2, 2,3, true);

insert into product (name, brand, code, description, unit_price, category_id, supplier_id, quantity, is_active, view, purchases)
values ('Oppo F7','Oppo','EROTGIERGDFLG','This is samsung companys description',5600.00, 3, 2,4, true);

insert into product (name, brand, code, description, unit_price, category_id, supplier_id, quantity, is_active, view, purchases)
values ('Lumia 625','Nokia','REGLBDJGDGS','This is nokia companys description',3600.00, 3, 2,2, true);

insert into product (name, brand, code, description, unit_price, category_id, supplier_id, quantity, is_active, view, purchases)
values ('Primo','Walton','GFEROGBGKHEH','This is walton companys description',2400.00, 1, 3,0, true);

insert into product (name, brand, code, description, unit_price, category_id, supplier_id, quantity, is_active, view, purchases)
values ('Lenovo B50-70','Lenovo','WPETJGJLFDK','This is lenovo companys description',3600.00, 3, 2,2,true);


