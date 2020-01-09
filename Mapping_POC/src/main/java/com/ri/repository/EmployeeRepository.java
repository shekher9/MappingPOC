package com.ri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ri.entity.EmployeeEntity;


@Repository("emprepo")
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
	
	EmployeeEntity findByid(int id);

}
