use quan_ly_sinh_vien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select SubName,max(Credit)
from Subject 
group by Credit;
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select Student.StudentName,max(Mark.Mark) as diem_thi_lon_nhat
from Student
join Mark on Student.StudentId=Mark.StudentId
group by StudentName;
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select Student.StudentId,Student.StudentName,avg(Mark.Mark) as diem_trung_binh
from Student
left join Mark on Student.StudentId=Mark.StudentId
group by Student.StudentId,Student.StudentName;

