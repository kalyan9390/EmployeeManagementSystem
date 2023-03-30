package com.employee.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee117;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee117, Integer> {

}
