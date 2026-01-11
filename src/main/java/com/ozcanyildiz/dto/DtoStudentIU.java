package com.ozcanyildiz.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DtoStudentIU {
	
	@NotEmpty(message="Kann nicht leer sein.")
	@Min(value = 3)
	@Max(value = 10)
	private String firstNameString;

	@Size(min=3,max=30)
	private String lastnameString;
	
	private LocalDate birthOfDate;

}
