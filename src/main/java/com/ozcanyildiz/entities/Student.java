package com.ozcanyildiz.entities;

import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Student {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idString; 
	
	@Column(name="first_name",nullable = false, length = 40)
	private String firstNameString;
	
	@Column(name="last_name",nullable = false)
	private String lastnameString;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name="birth_of_day", nullable=true)
	private LocalDate birthOfDate;

	

}
