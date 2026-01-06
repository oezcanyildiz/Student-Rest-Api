package com.ozcanyildiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ozcanyildiz.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
