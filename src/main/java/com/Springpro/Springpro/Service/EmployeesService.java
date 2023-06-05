package com.Springpro.Springpro.Service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Springpro.Springpro.Entity.Employees;
import com.Springpro.Springpro.Repository.EmployeesRepo;

@Service
public class EmployeesService {
	
	@Autowired
	private EmployeesRepo employeesRepo;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	

	public Employees saveDetails(Employees emp) {
		
		emp.setPassword(passwordEncoder.encode(emp.getPassword()));
		return employeesRepo.save(emp);
		 
	}
	
	
	public List<Employees> list() {
		
		return employeesRepo.findAll();
		 
	}

}
