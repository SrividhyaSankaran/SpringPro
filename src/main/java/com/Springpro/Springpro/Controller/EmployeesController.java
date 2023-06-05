package com.Springpro.Springpro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springpro.Springpro.Entity.Employees;
import com.Springpro.Springpro.Service.EmployeesService;
import com.mysql.cj.log.Log;

@RestController
@RequestMapping("/employee")
public class EmployeesController {

	@Autowired
	private EmployeesService employeesService;
	
	@GetMapping("/welcome")
	public String welcome() {
		
		return "Welcome to Employees Module of Spring Boot";
		
	}
	
	
	@GetMapping("/list")
	public List<Employees> list() {
		
		return employeesService.list();
		
	}
	
	@PostMapping("/add")
	public Employees save(@RequestBody Employees emp) {
		
		return employeesService.saveDetails(emp);
		
	}
}
