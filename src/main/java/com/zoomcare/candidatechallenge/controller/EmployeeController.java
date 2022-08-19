package com.zoomcare.candidatechallenge.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zoomcare.candidatechallenge.model.Employee;
import com.zoomcare.candidatechallenge.model.EmployeesList;
import com.zoomcare.candidatechallenge.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository empRepo;	

	@PostMapping("/v1/employeeDetails")
	public Employee getEmployeeDetails(@RequestParam("id") long id){ 
		Employee emp = empRepo.findByEmployeeID(id);
//		//TODO: Use optionals and findById ?
		if(emp!=null)
			return emp;
		else
			return null;
	}
	
	@PostMapping("/v1/employees")
	public EmployeesList getAllEmployees(){
		EmployeesList empList = new EmployeesList();
		List<Employee> emps = new ArrayList<Employee>();	
		for(Employee e : empRepo.findAll())
			emps.add(e);
			
		empList.setEmployees(emps);
		return empList;
	}

}
