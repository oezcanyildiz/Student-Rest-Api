package com.ozcanyildiz.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozcanyildiz.dto.DtoStudent;
import com.ozcanyildiz.dto.DtoStudentIU;
import com.ozcanyildiz.entities.Student;
import com.ozcanyildiz.repository.StudentRepository;
import com.ozcanyildiz.services.IstudentServices;

@Service
public class StudentServicesImpl implements IstudentServices {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public DtoStudent saveStudent(DtoStudentIU dtostudentIU) {
		DtoStudent response=new DtoStudent();
		Student student=new Student();
		BeanUtils.copyProperties(dtostudentIU, student);
		Student dbstudent= studentRepository.save(student);
		BeanUtils.copyProperties(dbstudent, response);
		return response;
	}

	@Override
	public List<DtoStudent> getAllStudents() {
		List<DtoStudent> responseList=new ArrayList<DtoStudent>();
		List<Student> studentList= studentRepository.findAll();
		
		for (Student student : studentList) {
			DtoStudent dto=new DtoStudent();
			BeanUtils.copyProperties(student, dto);
			responseList.add(dto);
		}
		return responseList;
	}

	@Override
	public DtoStudent getStudentByID(Long idString) {
		DtoStudent dto= new DtoStudent();
		Optional<Student> optional=studentRepository.findById(idString);
		if(optional.isPresent()) {
			Student dbStudent=optional.get();
			BeanUtils.copyProperties(dbStudent, dto);
		}
		return dto;
	}

	@Override
	public void deleteStudent(Long idString) {
		Optional<Student> optional=studentRepository.findById(idString);
		if(optional.isPresent()) {
			studentRepository.delete(optional.get());
		}
		

	}

	@Override
	public DtoStudent updateStudent(Long idString, DtoStudentIU dtoStudentIU) {
	    DtoStudent dto = new DtoStudent();

	    Optional<Student> optional = studentRepository.findById(idString);
	    if (optional.isPresent()) {
	        Student dbStudent = optional.get();

	        BeanUtils.copyProperties(dtoStudentIU, dbStudent);

	        Student updatedStudent = studentRepository.save(dbStudent);
	        BeanUtils.copyProperties(updatedStudent, dto);
	    }

	    return dto;
	}



	
	
}




































