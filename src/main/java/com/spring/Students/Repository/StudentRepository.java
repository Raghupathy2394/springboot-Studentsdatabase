package com.spring.Students.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Students.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
