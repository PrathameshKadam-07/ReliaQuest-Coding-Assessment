package com.service;

import java.util.*;
import java.util.UUID;

import com.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();

    Employee getEmployeeByUuid(UUID uuid);

    Employee createEmployee(Employee employee);

}
