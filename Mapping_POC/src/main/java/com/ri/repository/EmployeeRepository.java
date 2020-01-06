package com.ri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ri.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}
