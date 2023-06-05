package com.Springpro.Springpro.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springpro.Springpro.Entity.Employees;

public interface EmployeesRepo extends JpaRepository<Employees,Long> {

	Optional<Employees> findByName(String username);

}
