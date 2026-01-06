package com.ozcanyildiz.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozcanyildiz.entities.Student;
import com.ozcanyildiz.repository.StudentRepository;
import com.ozcanyildiz.services.IstudentServices;

@Service
public class StudentServicesImpl implements IstudentServices {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentList= studentRepository.findAll();
		return studentList;
	}

	@Override
	public Student getStudentByID(Long idString) {
		Optional<Student> optional=studentRepository.findById(idString);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void deleteStudent(Long idString) {
		
		Student dbStudent=getStudentByID(idString);
		if(dbStudent!=null) {
			studentRepository.delete(dbStudent);			
		}
		

	}

	@Override
	public Student updateStudent(Long idString, Student updateStudent) {
		Student dbStudent = getStudentByID(idString);
		if(dbStudent!=null) {
			dbStudent.setFirstNameString(updateStudent.getFirstNameString());
			dbStudent.setLastnameString(updateStudent.getLastnameString());
			dbStudent.setBirthOfDate(updateStudent.getBirthOfDate());
			
			studentRepository.save(dbStudent);
		}
		return null;
	}


	
	
}




































