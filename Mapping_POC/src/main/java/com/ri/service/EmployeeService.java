package com.ri.service;

import java.util.List;
import java.util.Map;

import com.ri.entity.EmployeeEntity;
import com.ri.model.EmployeeModel;

public interface EmployeeService {
	public Map<String, String> saveNewEmployee(EmployeeEntity entity);
	public List<EmployeeEntity> getAllEmployee();
	public EmployeeModel getEmployeeById(String employeeid);
	

}
