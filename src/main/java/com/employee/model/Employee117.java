package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee117 {

	@Id
	private Integer eid;
	@Column(length = 20)
	private String name;
	@Column(length = 20)
	private String password;
	@Column(length = 30)
	private String email;
	@Column(length = 20)
	private String address;

	// PDC+PPC+PSM+PGM+toString()
	public Employee117() {
		
	}

	public Employee117(Integer eid, String name, String password, String email, String address) {
		
		this.eid = eid;
		this.name = name;
		this.password = password;
		this.email = email;
		this.address = address;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", password=" + password + ", email=" + email + ", address="
				+ address + "]";
	}
}
