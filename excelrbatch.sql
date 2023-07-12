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



