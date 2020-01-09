package com.ri.service;

import java.util.List;

import com.ri.entity.DepartmentEntity;

public interface DepartmentService {
	public Integer saveNewDepartment(DepartmentEntity department);
	public List<DepartmentEntity> getAllDepartment();
	public DepartmentEntity getDepartmentById(Integer id);

}
