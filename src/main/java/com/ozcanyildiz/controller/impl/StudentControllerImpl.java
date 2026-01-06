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
import com.ozcanyildiz.entities.Student;
import com.ozcanyildiz.services.IstudentServices;

@RestController
@RequestMapping("/rest/api")
public class StudentControllerImpl implements IStudentController{

	@Autowired
	private IstudentServices studentServices;
	
	@PostMapping(path="/save")
	@Override
	public Student saveStudent(@RequestBody Student student) {
		return studentServices.saveStudent(student);
	}

	@GetMapping(path="/list")
	@Override
	public List<Student> getAllStudents() {
		return studentServices.getAllStudents();
	}

	@GetMapping(path="/list/{id}")
	@Override
	public Student getStudentByID(@PathVariable(name="id")Long idString) {
		return studentServices.getStudentByID(idString);
	}

	@DeleteMapping(path="/delete/{id}")
	@Override
	public void deleteStudent(@PathVariable(name="id")Long idString) {
		studentServices.deleteStudent(idString);
		
	}

	@PutMapping(path="/update/{id}")
	@Override
	public Student updateStudent(@PathVariable(name="id") Long idString,@RequestBody Student updateStudent) {
		return studentServices.updateStudent(idString, updateStudent);
		 
	}

}
