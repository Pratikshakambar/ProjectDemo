package com.app.pojos;

import javax.persistence.*;

@Embeddable
public class Laptop {

	@Column(name = "laptop_id")
	private int laptopId;
	@Column(length = 20)
	private String company;
	
	public Laptop() {
		System.out.println("in laptop const");
	}

	public Laptop(int laptopId, String company) {
		super();
		this.laptopId = laptopId;
		this.company = company;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", company=" + company + "]";
	}
	
}
