package com.ri.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.ri.entity.EmployeeEntity;
import com.ri.model.EmployeeModel;
import com.ri.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired(required = true)
	private EmployeeRepository emprepo;

	@Override
	public Map<String, String> saveNewEmployee(EmployeeEntity entity) {
		String msg=null;
		Map<String, String> map=new HashMap<String, String>();
		EmployeeEntity emp=emprepo.save(entity);
		if(emp.getId()!=null)
			map.put("Success", emp.getEmployeeid());
		else 
			map.put("Failed", "Data not saved");
		
		return map;
	}

	@Override
	public List<EmployeeEntity> getAllEmployee() {
		return emprepo.findAll();
		 
	}

	@Override
	public EmployeeModel getEmployeeById(String employeeid) {
		EmployeeModel model=null;
		EmployeeEntity entity=emprepo.findByEmployeeId(employeeid);
		BeanUtils.copyProperties(entity, model);
		return model;
	}

}
