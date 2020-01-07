package com.ri.model;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import com.ri.entity.AccountEntity;
import com.ri.entity.AddressEntity;
import com.ri.entity.DepartmentEntity;
import com.ri.entity.EducationEntity;

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
	
	private DepartmentEntity department;
	
	private List<EducationEntity> education;

	private List<AddressEntity> address;
	
	private Set<AccountEntity> account;

}
