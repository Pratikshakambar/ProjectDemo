package com.app.pojos;

import javax.persistence.*;


@Entity
public class Employee {

	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;

	
	@Column(length = 20, nullable = false)
	private String name;

	private double salary;

	@Embedded
	private Laptop laptopDeatils;

	/*
	 * The @JoinColumn annotation combined with a @OneToOne mapping indicates that a
	 * given column in the owner entity refers to a primary key in the reference
	 * entity:
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "number_plate")
	private Vehical v;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	

	public Employee() {
		System.out.println("in emp const");
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Laptop getLaptopDeatils() {
		return laptopDeatils;
	}

	public void setLaptopDeatils(Laptop laptopDeatils) {
		this.laptopDeatils = laptopDeatils;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Vehical getV() {
		return v;
	}

	public void setV(Vehical v) {
		this.v = v;
	}
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department2) {
		this.department = department2;
	}
	//care full with to string
	//do not call  (association based)student toString -- course will call students to string and students toString will call course
	//loop
	@Override
	public String toString() {
		return "Employee [eId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}


}
