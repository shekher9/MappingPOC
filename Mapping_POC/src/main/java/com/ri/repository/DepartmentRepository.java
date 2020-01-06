package com.ri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ri.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
