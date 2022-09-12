drop database if exists school;
create database school;
use school ;
create table class (
id int primary key auto_increment,
name_class varchar(40)
);
create table teacher(
id int primary key auto_increment,
name_teacher varchar(40),
age int,
country varchar(45)
);