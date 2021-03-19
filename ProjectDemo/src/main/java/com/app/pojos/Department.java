package com.app.pojos;

import java.util.List;

import javax.persistence.*;

@Entity
public class Department {
	
	@Id
	private String dept;
	
	@Column(unique = true)
	private int floor;
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Employee> emp;
	
	public Department() {
		System.out.println("in dept const");
	}

	public Department(String dept, int floor) {
		super();
		this.dept = dept;
		this.floor = floor;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}


	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Department [dept=" + dept + ", floor=" + floor + "]";
	}

	//helper method
	public void addEmp(Employee e) {
		this.emp.add(e);// p-->c
		e.setDepartment(this);// c-->c
	}
	public void removedEmp(Employee e) {
		this.emp.remove(e); // p---X--> c
		e.setDepartment(null);//c---X--> p
	}

}
