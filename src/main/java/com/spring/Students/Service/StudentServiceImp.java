package com.spring.Students.Service;

import com.spring.Students.Dto.DtoStudentpage;
import com.spring.Students.Dto.StudentDto;
import com.spring.Students.Entity.Student;

public interface StudentServiceImp {

	Student create(StudentDto studentdto);

	DtoStudentpage<Student> getall(int page, int size);

}
