package com.ri.model;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import com.ri.entity.Account;
import com.ri.entity.Address;
import com.ri.entity.Department;
import com.ri.entity.Education;

public class EmployeeModel {
	
	private Integer id;
	
	private String employeeid;

	private String empname;

	private long contactno;

	private String gender;
	
	private String degination;
	
	private Date dob;
	
	private Date doj;
	
	private String email;
	
	private String maritalStatus;
	
	private Department department;
	
	private List<Education> education;

	private List<Address> address;
	
	private Set<Account> account;

}
