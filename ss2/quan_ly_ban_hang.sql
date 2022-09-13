drop database if exists quan_ly_cua_hang;
create database quan_ly_cua_hang;
use quan_ly_cua_hang;
create table customer(
c_id int primary key,
c_name varchar(40),
c_age int
);
create table oder(
o_id int primary key,
o_date date,
o_total_price double,
c_id int,
foreign key (c_id) references customer(c_id)
);
create table product(
p_id int primary key,
p_name varchar(40),
p_price double
);
create table oder_detail(
o_id int,
p_id int,
foreign key (o_id) references oder(o_id),
foreign key (p_id) references product(p_id)
);
