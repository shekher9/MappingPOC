package com.ri.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ri.entity.EmployeeEntity;
import com.ri.model.EmployeeModel;
import com.ri.repository.EmployeeRepository;
@Service("empservice")
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired(required = true)
	private EmployeeRepository emprepo;

	@Override
	public int saveNewEmployee(EmployeeEntity entity) {
		String msg=null;
		Map<String, String> map=new HashMap<String, String>();
		EmployeeEntity emp=emprepo.save(entity);
		if(emp.getId()!=null)
			return emp.getId();
		else 
			return 0;
		
		
	}

	@Override
	public List<EmployeeEntity> getAllEmployee() {
		return emprepo.findAll();
		 
	}

	@Override
	public EmployeeModel getEmployeeById(int id) {
		EmployeeModel model=null;
		EmployeeEntity entity=emprepo.findByid(id);
		BeanUtils.copyProperties(entity, model);
		return model;
	}

}
