package com.example.sale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	@GetMapping({"/admin/dashboard", "/admin"})
	public String dashboard(){
		return "admin/layout/HomePage";
	}
	


}
