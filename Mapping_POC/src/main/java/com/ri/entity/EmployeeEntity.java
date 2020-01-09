package com.ri.entity;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import lombok.Data;

@Data
@Entity
@Table(name="EMPLOYEE_MAP")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	/* private String employeeid; */
	@Column
	private String empname;
	@Column
	private long contactno;
	@Column
	private String gender;
	@Column
	private String degination;
	@Column
	private Date dob;
	@Column
	private Date doj;
	@Column
	private String email;
	@Column
	private String maritalStatus;
	/*
	 * @ManyToOne(targetEntity = DepartmentEntity.class, cascade = CascadeType.ALL,
	 * fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(name = "departmentId",referencedColumnName = "dept_id") private
	 * DepartmentEntity department;
	 */
	@OneToMany(targetEntity = EducationEntity.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name = "employeeid",referencedColumnName = "id")
	@Fetch(FetchMode.JOIN)
	private List<EducationEntity> education;
	@OneToMany(targetEntity = EducationEntity.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name = "employeeid",referencedColumnName = "id")
	@Fetch(FetchMode.JOIN)
	private List<AddressEntity> address;
	@OneToOne(targetEntity = AccountEntity.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@LazyToOne(value = LazyToOneOption.PROXY)
	@Fetch(FetchMode.JOIN)
	private AccountEntity account;

}
