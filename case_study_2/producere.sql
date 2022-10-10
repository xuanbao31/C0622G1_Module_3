delimiter //
create procedure editCustomer (
	in idEdit int,
    in customerTypeId int,
    in name varchar(45),
    in dateOfBirth date,
    in gender bit(1),
    in idCard varchar(45),
    in phoneNumber varchar(45),
    in email varchar(45),
    in address varchar(45)
) 
begin 
UPDATE `case_study_furama_jsp`.`customer` SET `customer_type_id` = customerTypeId,
`customer_name` = name, `customer_birthday` = dateOfBirth,
`customer_gender` = gender, `customer_id_card` = idCard, `customer_phone` = phoneNumber,
`customer_email` = email, `customer_address` = address WHERE (`customer_id` = idEdit);
end //
delimiter //

call editCustomer ('2','1','bao30','2000-11-11',1,'123123123','123123123','bao30@gmail.com','VietNam')