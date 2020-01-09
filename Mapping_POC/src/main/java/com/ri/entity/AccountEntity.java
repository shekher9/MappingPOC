package com.ri.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="account_detail")
public class AccountEntity {
	@Id
	private Long accountno;
	@Column
	private String bankname;
	@Column
	private String accounttype;
	@Column
	private String ifsccode;
	@OneToOne(targetEntity = EmployeeEntity.class,orphanRemoval = true)
	private EmployeeEntity emp;
	

}
