package com.ozcanyildiz.controller;

import java.util.List;

import com.ozcanyildiz.dto.DtoStudent;
import com.ozcanyildiz.dto.DtoStudentIU;
import com.ozcanyildiz.entities.Student;

public interface IStudentController {
	
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentByID(Long idString);
	
	public void deleteStudent(Long idString);
	
	public DtoStudent updateStudent(Long idString, DtoStudentIU dtoStudentIU);

}
