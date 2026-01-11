package com.ozcanyildiz.services;

import java.util.List;

import com.ozcanyildiz.dto.DtoStudent;
import com.ozcanyildiz.dto.DtoStudentIU;


public interface IstudentServices {
	
	public DtoStudent saveStudent(DtoStudentIU student);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentByID(Long idString);
	
	public void deleteStudent(Long idString);
	
	public DtoStudent updateStudent(Long idString, DtoStudentIU dtoStudentIU);

}
