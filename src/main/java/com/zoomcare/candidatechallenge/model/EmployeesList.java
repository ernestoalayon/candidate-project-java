package com.zoomcare.candidatechallenge.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeesList {

	    @JsonProperty(value = "employees", required = true)
	    List<Employee> employees;

	    public List<Employee> getEmployees() {
	        return employees;
	    }
	    public void setEmployees(List<Employee> oneList) {
	        this.employees = oneList;
	    }
	}

