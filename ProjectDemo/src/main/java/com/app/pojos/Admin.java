package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

	@Id
	@Column(length = 30)
	private String email;
	@Column(length = 30)
	private String password;
	
	public Admin() {
		System.out.println("in admin constr ");
	}

	public Admin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [email=" + email + ", password=" + password + "]";
	}
	
}
