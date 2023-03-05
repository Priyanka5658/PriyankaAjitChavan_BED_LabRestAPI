package com.greatlearning.studentmanagement.controller;
import java.security.Principal;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.greatlearning.studentmanagement.entity.Student;
import com.greatlearning.studentmanagement.service.StudentService;
import com.greatlearning.studentmanagement.service.StudentServiceImpl;
@Controller
@RequestMapping("/student")

public class StudentController {
	/* 
    * /StudentManagement/student/list
    * /StudentManagement/student/showFormForAdd 
    * /StudentManagement/student/showFormForUpdate 
    * /StudentManagement/student/delete
    * /StudentManagement/student/save
    */
	@Autowired
	StudentService service;
	
	@RequestMapping("/list")
	public String viewAllStudents (Model model) {
	List<Student> students = service.getAllStudents(); 
	model.addAttribute("Students", students); 
	return "list-Students";
    }
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd (Model model) { 

	
		 Student student = new Student();
	     model.addAttribute("Student", student); 
		 return "Student-form";
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate (Model model,@RequestParam(name="studentId") int id) { 
		 Student student = service.getStudentById(id);
	     model.addAttribute("Student", student); 
		 return "Student-form";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(name="studentId") int id) {
		 service.deleteByStudentId(id);
		 return "redirect:/student/list";}
       
	
	
	@RequestMapping("/save")
	 public String save(@RequestParam(name="id") int id,﻿@RequestParam(name="firstName") String firstName) { 
		Student student;
		if(id==0) {
		student = new Student();
		}else {
		student service;
		getStudentById(id);
	    }
		student.setFirstName (firstName);
		student.setLastName(lastName);
		student.setCourse(course); 
		student.setCountry (country); 
		service.addOrUpdate (student);
		return "redirect:/student/list";
	}
	
	﻿@GetMapping("/403")
	public ModelAndView accessDenied (Principal user) {
	ModelAndView result = new ModelAndView();
	result.addObject("msg", "Hi "+user.getName() +" does not have author: result.setViewName 403");
	return result;
	}
}




