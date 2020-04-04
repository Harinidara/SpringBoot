package com.capgemini.dao;

import java.util.List;

import com.capgemini.bean.Employee;

public interface EmployeeDaoI {

	Employee getEmployeeDetails(int id);

	Employee createEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	Employee deleteEmployee(int id);

	List<Object> fetchAllEmployees();

}
