drop database if exists mo_hinh_quan_he;
create database mo_hinh_quan_he;
use mo_hinh_quan_he;
create table phieu_xuat(
soPx int primary key,
ngay_xuat varchar(40)
);
create table vat_tu(
ma_vtu varchar(40) primary key ,
ten_vtu varchar(40)
);
create table chi_tiet_phieu_xuat(
don_gia_xuat double,
so_luong_xuat int,
soPx int,
ma_vtu varchar(40),
primary key(soPx,ma_vtu),
foreign key(ma_vtu) references vat_tu(ma_vtu),
foreign key (soPx) references phieu_xuat(soPx)
);
create table phieu_nhap(
soPN int primary key,
ngay_nhap varchar(40)
);
create table chi_tiet_phieu_nhap(
don_gia_nhap double,
so_luong_nhap int,
ma_vtu varchar(40),
soPN int,
primary key (ma_vtu,soPN),
foreign key(ma_vtu) references vat_tu(ma_vtu),
foreign key(soPN) references phieu_nhap(soPN)
);
create table don_dat_hang(
soDH double primary key ,
ngay_dh varchar(40)
);
create table chi_tiet_don_dat_hang(
ma_vtu varchar(40),
soDH double,
primary key(ma_vtu,soDH),
foreign key (ma_vtu) references vat_tu(ma_vtu),
foreign key (soDH) references don_dat_hang(soDH)
);
create table so_dien_thoai(
so_phone varchar(40) ,
ma_so_phone varchar(30) primary key
);
create table nha_cung_cap(
ma_nha_cung_cap varchar(40),
ten_nha_cung_cap varchar(40),
dia_chi varchar(40),
ma_so_phone varchar(40),
foreign key (ma_so_phone) references so_dien_thoai(ma_so_phone)
);
create table cung_cap(
soDH double,
ma_nha_cung_cap varchar(40),
primary key(soDH,ma_nha_cung_cap),
foreign key (soDH) references don_dat_hang(soDH),
foreign key (ma_nha_cung_cap)references nha_cung_cap(ma_nha_cung_cap)
);