package com.ri.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DEPARTMENT")
public class DepartmentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	/* @OneToMany(targetEntity = EmployeeEntity.class,cascade = CascadeType.ALL) */
	private Integer deptid;
	
	@Column
	private String departmentname;

}
