package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Employee;

public interface EmployeeServiceI {

	Employee getEmployeeDetails(int id);

	Employee createEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	Employee deleteEmployee(int id);

	List<Object> fetchAllEmployees();

}
