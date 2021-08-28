package com.net.javaguides.springbootbackend.model;

import javax.persistence.Column;
import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long Id;
	
	@Column(name="first_name")
	
	private String firstName;
	
	@Column(name="last_name")
	
	private String lastName;
	
	@Column(name="email_id")
	
	private String emailID;
	
	public Employee() {
		super();
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
}
