package com.net.javaguides.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.net.javaguides.springbootbackend.repository.EmploteeRepository;
import com.net.javaguides.springbootbackend.model.Employee;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("api/v1")

public class EmployeeController {
	
	@Autowired
	private EmploteeRepository emploteeRepository;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		
	return emploteeRepository.findAll();
	}

}
