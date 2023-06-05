package com.Springpro.Springpro.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Table(name="employees")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employees {

	@Id
	@Column(name="emp_id")
	@GeneratedValue
	private Long id;
	
	@Column(name="emp_name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="dept")
	private String dept;
	
	@Column(name="salary")
	private String salary;
	
	@Column(name="doj")
	private Date doj;
	
	@Column(name="password")
	private String password;

	public Long getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	
}
