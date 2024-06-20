package com.spring.Students.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Students.Entity.Attend;

public interface AttendRepository extends JpaRepository<Attend, Integer>{

}
