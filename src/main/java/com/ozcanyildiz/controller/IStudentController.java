package com.ozcanyildiz.controller;

import java.util.List;

import com.ozcanyildiz.entities.Student;

public interface IStudentController {
	
	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Student getStudentByID(Long idString);
	
	public void deleteStudent(Long idString);
	
	public Student updateStudent(Long idString, Student updateStudent);

}
