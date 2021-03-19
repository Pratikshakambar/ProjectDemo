package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Admin;
import com.app.service.AdminServiceImpl;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminServiceImpl adminService;

	@GetMapping("/login")
	public String showAdminLogin() {
		System.out.println("in show admin login page");
		System.out.println("again for trying git");
		System.out.println("again for trying git2");
		return "/admin/login";
	}
	@PostMapping("/login")
	public String validateAdmin(@RequestParam  String email,@RequestParam String password,ModelMap modelMap) {
		System.out.println("in validate admin");
		Admin admin = adminService.validateAdmin(email, password);
		if(admin!=null) {
			System.out.println("login success");
		return "/employee/registration";
		}
		System.out.println("login fail");
		modelMap.addAttribute("msg", "Invalid email or password .. try again");
		return "/admin/login";
	}
}
