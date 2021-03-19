package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.DepartmentRepository;
import com.app.pojos.Department;

public class DepartmentServiceImpl implements IDepartmentService{

	@Autowired
	DepartmentRepository dept;
	@Override
	public List<Department> fetchAllDepartment() {
		
		return dept.findAll();
	}

}
