package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("in home controller");
	}
	@GetMapping("/")
	public String showIndexPage() {
		System.out.println("in show index page");
		return "/index";
	}
}
