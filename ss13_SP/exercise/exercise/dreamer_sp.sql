drop database if exists dreamer_sp;
create database dreamer_sp;
use dreamer_sp;
create table users(
id int primary key auto_increment,
full_name varchar(45),
age varchar(45),
country varchar(45),
address varchar(45)
);
insert into users values(1,"Hồ Xuân Bảo","22","USA","Atlanta");
insert into users values(2,"Hồ Xuân Huy","25","USA","Atlanta");
insert into users values(3,"Hồ Ngọc Huy","22","Việt Nam","Đà Nẵng");
insert into users values(4,"Tống Nhật Minh","28","Korea","Intaewon");

select * from users;
select * from users where country like 'USA';