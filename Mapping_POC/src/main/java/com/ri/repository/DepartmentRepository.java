package com.ri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ri.entity.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {
	
	public DepartmentEntity findBydeptid(Integer id);

}
