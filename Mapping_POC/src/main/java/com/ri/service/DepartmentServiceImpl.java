package com.ri.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ri.entity.DepartmentEntity;
import com.ri.repository.DepartmentRepository;

@Service(value = "deptservice")
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired(required = true)
	private DepartmentRepository deptrepository;

	@Override
	public Integer saveNewDepartment(DepartmentEntity department) {
		
		DepartmentEntity dept=deptrepository.save(department);
		if(dept.getDept_id()!=null) {
			return dept.getDept_id();
		}
		else 
			return 0;
	}

	@Override
	public List<DepartmentEntity> getAllDepartment() {
		//List<Department> listdept=new ArrayList<Department>();
		return deptrepository.findAll();
		//return null;
	}

	@Override
	public DepartmentEntity getDepartmentById(int id) {
		return deptrepository.findByDept_id(id);
		//return null;
	}

}
