package com.ri.model;

import javax.persistence.Column;

import lombok.Data;

@Data
public class Account {
	private Long accountno;

	private String bankname;

	private String accounttype;

	private String ifsccode;

}
