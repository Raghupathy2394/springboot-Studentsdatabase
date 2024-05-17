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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Students.Entity.Student;
import com.spring.Students.Repository.StudentRepository;


@RestController

public class ControlStudent{
@Autowired
StudentRepository repo;	
@GetMapping("/students")	
public List<Student> getAllstudents(){
	List<Student> students=repo.findAll();
	return students;
} 
@GetMapping("/student/{id}")
public Student getStudent(@PathVariable int id) {
	Student student=repo.findById(id).get();
	return student;
}
@PostMapping("/student/add")
@ResponseStatus(code=HttpStatus.CREATED)
public void createStudent(@RequestBody Student student) {
	repo.save(student);
}
@PutMapping("/student/update/{id}")
public Student updateStudent(@PathVariable int id) {
	Student student=repo.findById(id).get();
	student.setName("Alex");
	student.setRollno(555);
	student.setDept("Civil");
	repo.save(student);
	return student;
}
@DeleteMapping("/student/delete/{id}")
public Student removeStudent(@PathVariable int id) {
	Student student=repo.findById(id).get();
	repo.delete(student);
	return student;

}

}

