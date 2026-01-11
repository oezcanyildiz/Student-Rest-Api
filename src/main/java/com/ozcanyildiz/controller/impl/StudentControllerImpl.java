package com.ozcanyildiz.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozcanyildiz.controller.IStudentController;
import com.ozcanyildiz.dto.DtoStudent;
import com.ozcanyildiz.dto.DtoStudentIU;
import com.ozcanyildiz.entities.Student;
import com.ozcanyildiz.services.IstudentServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api")
public class StudentControllerImpl implements IStudentController{

	@Autowired
	private IstudentServices studentServices;
	
	@PostMapping(path="/save")
	@Override
	public DtoStudent saveStudent(@RequestBody @Valid DtoStudentIU dtoStudentIU) {
		return studentServices.saveStudent(dtoStudentIU);
	}

	@GetMapping(path="/list")
	@Override
	public List<DtoStudent> getAllStudents() {
		return studentServices.getAllStudents();
	}

	@GetMapping(path="/list/{id}")
	@Override
	public DtoStudent getStudentByID(@PathVariable(name="id")Long idString) {
		return studentServices.getStudentByID(idString);
	}

	@DeleteMapping(path="/delete/{id}")
	@Override
	public void deleteStudent(@PathVariable(name="id")Long idString) {
		studentServices.deleteStudent(idString);
		
	}

	@PutMapping(path="/update/{id}")
	@Override
	public DtoStudent updateStudent(@PathVariable(name="id") Long idString,@RequestBody DtoStudentIU dtoStudentIU) {
		return studentServices.updateStudent(idString, dtoStudentIU);
		 
	}

}
