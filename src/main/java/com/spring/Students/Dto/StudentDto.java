package com.spring.Students.Dto;

import com.spring.Students.Entity.Attend;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class StudentDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String dept;
	
	private int rollno;
	
 private Attend attend;
}
