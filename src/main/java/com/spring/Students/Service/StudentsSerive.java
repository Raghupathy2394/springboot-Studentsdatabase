package com.spring.Students.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spring.Students.Dto.DtoStudentpage;
import com.spring.Students.Dto.StudentDto;
import com.spring.Students.Entity.Student;
import com.spring.Students.Repository.StudentRepository;

@Service
public class StudentsSerive implements StudentServiceImp {

	@Autowired
	StudentRepository studentRepo;

	@Override
	public Student create(StudentDto studentdto) {
		Student entity = new Student();
		entity.setId(studentdto.getId());
		entity.setName(studentdto.getName());
		entity.setRollno(studentdto.getRollno());
		entity.setAttend(studentdto.getAttend());
		entity.setDept(studentdto.getDept());
		return studentRepo.save(entity);
	}

	@Override
	public DtoStudentpage<Student> getall(int page, int size) {
		Pageable pageable = PageRequest.of(page, size,Sort.by("name"));
		Page<Student> page1 = studentRepo.findAll(pageable);
		DtoStudentpage<Student> dto = new DtoStudentpage<Student>();
		dto.setContent(page1.getContent());
		dto.setPageNumber(page1.getNumber());
		dto.setPageSize(page1.getSize());
		dto.setFirst(page1.isFirst());
		dto.setLast(page1.isLast());
		dto.setTotalCount(page1.getTotalElements());
		dto.setTotalPage(page1.getTotalPages());
		return dto;
	}

}
