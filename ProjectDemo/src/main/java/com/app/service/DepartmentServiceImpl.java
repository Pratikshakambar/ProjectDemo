package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.DepartmentRepository;
import com.app.pojos.Department;
@Service
@Transactional
public class DepartmentServiceImpl implements IDepartmentService{

	@Autowired
	DepartmentRepository dept;
	@Override
	public List<Department> fetchAllDepartment() {
		
		return dept.findAll();
	}

}
