package com.Springpro.Springpro.Config;

import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.Springpro.Springpro.Entity.Employees;
import com.Springpro.Springpro.Repository.EmployeesRepo;


@Component
public class UserInfoUserDetailsService implements UserDetailsService{

	Logger log = Logger.getLogger(UserInfoUserDetailsService.class.getName());
	@Autowired
	EmployeesRepo employeesRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<Employees> emp = employeesRepository.findByName(username);
		log.info(emp.toString());
		
		return emp.map(UserInfoUserDetails::new).orElseThrow();
		
	}

}
