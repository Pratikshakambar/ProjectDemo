package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.pojos.Department;
import com.app.service.DepartmentServiceImpl;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	DepartmentServiceImpl deptService;
	
	public EmployeeController() {
		System.out.println("in employee controller");
	}
	@GetMapping("/registration")
	public String showRegistrationForm(ModelMap modelMap) {
		System.out.println("in show registration");
		List<Department> list = deptService.fetchAllDepartment();
		modelMap.addAttribute("departmentList", list);
		return "/employee/registration";
	}
}
