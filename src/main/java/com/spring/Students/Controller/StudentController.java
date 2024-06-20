package com.spring.Students.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Students.Dto.DtoStudentpage;
import com.spring.Students.Dto.StudentDto;
import com.spring.Students.Entity.Student;
import com.spring.Students.Repository.StudentRepository;
import com.spring.Students.Service.StudentServiceImp;


@RestController
@RequestMapping("/studentad")
public class StudentController{
	
@Autowired
StudentServiceImp serviceimp;

@PostMapping("/post")
public Student create(@RequestBody StudentDto studentdto) {
	return serviceimp.create(studentdto);
}

@GetMapping("/getAll/{page}/{size}")
public DtoStudentpage<Student> getall(@PathVariable int page, @PathVariable int size){
	return serviceimp.getall(page,size);
}
}

