create database excelrdemo;

use excelrdemo;

-- to rename a table 
alter table tablename
rename to newtablename;



-- not null, unique, check ,primary key, foreign key ,default

-- columns - attributes/propertiers
-- rows - tuples
-- tables - entities


create table products(
id int primary key auto_increment,
name varchar(20) not null,
price int not null check(price>0),
category varchar(30) not null default "general",
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp on update current_timestamp
);

drop table products;

-- to rename a column
alter table products
rename column name to pname;

-- to add a new column
alter table products
add column quantity int not null after category;
-- just like after before is also there


insert into products(name,price,category) values('Asus Laptop',33300,'Electronics'); 

-- to view all products 
select * from products;

-- to view specific columns
select name,price from products;


-- clause - where (used to specify conditions)
-- relational operators - > < = <> >= <= , in,  not in
-- conditional - and or
-- to fetch all the products in electronic category
select * from products where category = 'Electronics';

-- to fetch all the products whose price is greater than  1000
select * from products where price>1000 or category="Electronics";

-- to fetch all the producs where price is either 1000 or 2000 or 3000
select * from products where price not in(1000,2000,3000);

-- to fetch all the product  who come under the price range of 1000 - 5000
select * from products where price >=1000 and price <=5000;
select * from products where price between 1000 and 5000;

-- to fetch all the products which wwre created on 12 june
select * from products where created_at = '2023-07-12 21:06:36';

-- to delete a row 

delete from products where id=4;





-- to update a record 
update products
set price = 15
where id = 3;

update products
set quantity = 500
where id=2;



desc products;







-- department table 

create table departments(
id int primary key auto_increment,
name varchar(20) not null unique,
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp on update current_timestamp
);

insert into departments(name) values('IT'),('Sales'),('Marketing'),('HR');

select * from departments;

delete from departments;

truncate table departments;

-- set foreign_key_checks = 1;


-- ///////////


create table employees
(
id int primary key auto_increment,
name varchar(30) not null,
email varchar(30) not null unique,
salary bigint not null check(salary > 0),
did int,
foreign key(did) references departments(id),
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp on update current_timestamp
);

desc employees;


insert into employees(name,email,salary,did) values('Tharun','thar@gmail.com',23000,null);

select * from departments;
select * from employees;


-- joining multiple tables and viewing data


-- inner join 

select d.name,e.name,e.salary from departments d inner join employees e
on d.id = e.did;


select d.name,e.name,e.salary from departments d,employees e
where d.id=e.did;





select * from employees right join departments
on departments.id = employees.did;

select * from employees cross join departments;


-- timepass

create table kschool(
id int primary key auto_increment,
name varchar(30),
mid int,
foreign key(mid) references kschool(id)
);

insert into kschool(name,mid) values('Manoj',2);

select * from kschool;

select * from kschool k1 inner join kschool k2
on k1.id=k2.mid;
















