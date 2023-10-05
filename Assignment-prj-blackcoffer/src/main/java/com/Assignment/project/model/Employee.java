package com.Assignment.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="employee")
public class Employee{

	@Id
	private long id;
	
	@Column(name = "employee_name")
	private String e_name;
	@Column(name = "employee_phone")
	private Long e_phone;
	@Column(name = "city")
	private String e_city;
	@Column(name = "age")
	private long e_age;
	
	
	public Employee() {
		super();
	}

	public Employee(long id, String e_name, Long e_phone, String e_city, long e_age) {
		super();
		this.id = id;
		this.e_name = e_name;
		this.e_phone = e_phone;
		this.e_city = e_city;
		this.e_age = e_age;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public Long getE_phone() {
		return e_phone;
	}
	public void setE_phone(Long e_phone) {
		this.e_phone = e_phone;
	}
	public String getE_city() {
		return e_city;
	}
	public void setE_city(String e_city) {
		this.e_city = e_city;
	}
	public long getE_age() {
		return e_age;
	}
	public void setE_age(long e_age) {
		this.e_age = e_age;
	}
		
}
