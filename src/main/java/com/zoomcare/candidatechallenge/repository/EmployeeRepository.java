package com.zoomcare.candidatechallenge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zoomcare.candidatechallenge.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	Employee findByEmployeeID(long custormerId);

}
