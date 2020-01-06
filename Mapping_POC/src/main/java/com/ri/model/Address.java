package com.ri.model;

import lombok.Data;

@Data
public class Address {
	private String address;
	
	private String street;

	private String city;

	private String distric;

	private String state;

	private String country;
	
	private Integer pincode;
}
