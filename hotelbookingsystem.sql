create database hotel_booking_system;

use hotel_booking_system;

create table rooms(
id int primary key auto_increment,
room_no int unique not null,
type varchar(20) default 'basic',
price int not null check(price>0),
guest_count int default 2,
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp on update current_timestamp
);

alter table rooms
add column available boolean default false after guest_count;

update rooms
set available = 0
where id in(2,6,5);

create table customers(
id int primary key auto_increment,
name varchar(30) not null,
email varchar(30) not null unique,
contact varchar(10) not null unique,
city varchar(20) not null,
gov_id varchar(20) not null unique,
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp on update current_timestamp
);

create table dishes(
id int primary key auto_increment,
name varchar(20) not null unique,
price int not null check(price>0),
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp on update current_timestamp
);


create table bookings(
id int primary key auto_increment,
room_id int,
customer_id int,
check_in date,
check_out date,
total_amount int check(total_amount>0),
foreign key(room_id) references rooms(id),
foreign key(customer_id) references customers(id),
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp on update current_timestamp
);


create table dish_orders(
id int primary key auto_increment,
booking_id int,
dish_id int,
quantity int check(quantity>0),
foreign key(booking_id) references bookings(id),
foreign key(dish_id) references dishes(id),
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp on update current_timestamp
);

desc rooms;
desc customers;
desc bookings;
desc dishes;
desc dish_orders;

select * from rooms;
select * from customers;
select * from dishes;
select * from bookings;


insert into rooms(room_no,type,price,guest_count) 
values
(101,'Basic',2000,2),
(102,'Basic',2000,2),
(103,'Deluxe',3000,3),
(104,'Super Deluxe',5000,4),
(201,'Basic',2500,3),
(202,'Super Deluxe',5000,4);

insert into customers(name,email,contact,city,gov_id) values
('Nand Patel','nand@gmail.com','7658768','Surat','ind1201'),
('Aaqib','aquib@gmail.com','546576','Baramulla','ind7867'),
('Aditi','aditi@gmail.com','78687687','Asansol','ind6569'),
('Mahendra','mahi@gmail.com','876869','Kadapa','ind5667');


insert into dishes(name,price) values
('Paneer Tikka',200),
('Chicken Tikka',230),
('Roti',15),
('Dal Tadka',250),
('Steamed Rice',100),
('Gulab Jamun',40);


insert into bookings(room_id,customer_id,check_in,check_out,total_amount) values
(5,2,'2023-07-19','2023-07-20',8000);




-- to get all the rooms which are available 
select * from rooms
where available = true;

-- see the room info for customer named aqib
select r.room_no,r.type,c.name from rooms r,customers c,bookings b
where r.id = b.room_id
and c.id = b.customer_id
and c.name='Aaqib';

select * from bookings where customer_id=2;



-- show email id and name of customer who booked room 101
select * from rooms r,customers c, bookings b
where c.id=b.customer_id
and r.id=b.room_id
and r.room_no=101;


-- show all the orders done for room no 102

select * from rooms r,bookings b,food_orders f,dish d
where r.id=b.room_id
and b.id = f.booking_id
and d.id = f.dish_id
and r.room_no = 102;
 
 
 
 select r.id,r.room_no,c.name,c.id,b.total_amount from rooms r,customers c,bookings b
 where r.id=b.room_id
 and c.id=b.customer_id;
 
 select * from customers limit 1; -- 0,3; (start,count of records)
 
 

 
 -- get all the bookings and room details for a particular customer
 
 -- display all the customer names who have ever booked room no 102
 
 -- display all the booking details sorted by total_amount in ascending order
 
 -- display the customer name who has payed the highest amount for any booking (limit will be helpfull)
 
 -- display the avg total_amount of booking for a particular customer
 
 -- display all the dishes orderd for room no 201
 
 -- display all the dishes for a particular customer
 
 -- display the customer with most bookings (group by)
 
 -- get all the rooms whose price range is between 2000 - 10000
 
 -- find the most ordered dish of all time 
 
 
 select count(*),d.name from dish_orders o,dishes d 
 where d.id=o.dish_id
 group by d.name
 order by count(*) desc
 limit 1;
 
 sgupta8mz@gmail.com
 
 
 
 
 
 
 













