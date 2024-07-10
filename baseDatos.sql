drop database if exists shopAll;
create database shopAll;
use shopAll;


create table users(
	id_users int not null primary key auto_increment,
    user varchar(20),
    password varchar(20),
    token varchar(100)
);

create table products(
	id_products int not null primary key auto_increment,
    product_name varchar(50),
    description varchar(100),
    price double
);

create table sale (
	id_sale int not null primary key auto_increment,
    id_products int,
    date varchar(30),
    final_price double 
);

INSERT INTO products (id_products, product_name, description, price) VALUES
(1, 'Laptop Pro', 'High-performance laptop with 16GB RAM', 1299.99),
(2, 'Smartphone X', 'Latest model with 5G connectivity', 999.99),
(3, 'Wireless Earbuds', 'Noise-cancelling wireless earbuds', 199.99),
(4, 'Gaming Console', 'Next-gen gaming console with 4K support', 499.99),
(5, 'Smartwatch 2.0', 'Advanced smartwatch with health monitoring', 249.99),
(6, '4K TV', 'Ultra HD 4K television with HDR', 799.99),
(7, 'Bluetooth Speaker', 'Portable Bluetooth speaker with deep bass', 149.99),
(8, 'Tablet Pro', 'High-resolution tablet with stylus support', 599.99),
(9, 'DSLR Camera', 'Professional DSLR camera with 24MP sensor', 1199.99),
(10, 'Fitness Tracker', 'Wearable fitness tracker with heart rate monitor', 99.99);

select * from products;


