package com.ri.response;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class EmployeeResponse {
	private String empid;
	private HttpStatus ststus;
	private String message;

}
