package com.ri.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="ADDRESS")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int address_id;
	@Column
	private String address;
	@Column
	private String street;
	@Column
	private String city;
	@Column
	private String distric;
	@Column
	private String state;
	@Column
	private String country;
	@Column(length = 6)
	@Size(min = 6,max = 6)
	private Integer pincode;

}
