package com.ozcanyildiz.exception;

import java.util.List;
import java.util.Date;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApiError {
	
	private String id;
	
	private Date errorTimeDate;
	
	private Map<String, List<String>> errors;

}
