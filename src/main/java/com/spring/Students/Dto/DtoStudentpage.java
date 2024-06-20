package com.spring.Students.Dto;

import java.util.List;

import lombok.Data;

@Data
public class DtoStudentpage<T> {
	
	private List<T> content;
	
	private int pageSize;
	
	private int pageNumber;
	
	private int totalPage;
	
	private long totalCount;
	
	private boolean isFirst;
	
	private boolean isLast;
 
}
