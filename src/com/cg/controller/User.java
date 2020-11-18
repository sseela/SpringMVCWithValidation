package com.cg.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class User {
 
	@NotNull(message="name cannot be empty")
	@Size(min=2, max=7, message="lenght of the name should be between 2 and 7")
	private String name;
	@NotBlank(message="email cannot be empty")
	private String email;
	@NotBlank(message="occupation cannot be blank")
	private String occupation;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
