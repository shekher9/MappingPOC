package com.ri.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DEPARTMENT")
public class DepartmentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer dept_id;
	
	@Column
	private String departmentname;

}
