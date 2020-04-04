package com.capgemini.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bean.Employee;
import com.capgemini.dao.EmployeeDao;


@Service
@Transactional
public class EmployeeService implements EmployeeServiceI {
	
	@Autowired
	private EmployeeDao dao;
    
	@Override
	public Employee getEmployeeDetails(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployeeDetails(id);
	}

    @Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.createEmployee(employee);
	}

    @Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(employee);
	}

    @Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}

    @Override
	public List<Object> fetchAllEmployees() {
		// TODO Auto-generated method stub
		return dao.fetchAllEmployees();
	}

}
