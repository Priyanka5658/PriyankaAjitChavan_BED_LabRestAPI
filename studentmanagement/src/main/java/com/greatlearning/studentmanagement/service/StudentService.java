package com.greatlearning.studentmanagement.service;

﻿import java.util.List;

import com.greatlearning.studentmanagement.entity.Student;

public interface StudentService { 
	List<Student> getAllStudents(); 
	void addorUpdate (Student student); 
	void deleteByStudentId(int id); 
	Student getStudentById(int id);
}