package com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.bean.Employee;


@Repository
public class EmployeeDao implements EmployeeDaoI {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public Employee getEmployeeDetails(int id) {
		Employee emp = entityManager.find(Employee.class, id);
		return emp;
	}
	
   @Override
	public Employee createEmployee(Employee employee) {
	   employee = entityManager.merge(employee);
		return employee;
	}

   @Override
	public Employee updateEmployee(Employee employee) {
	   Employee emp = entityManager.find(Employee.class, employee.getEid());
		emp.setEname(employee.getEname());
		emp.setEsal(employee.getEsal());
		entityManager.merge(emp);
		return emp;
	}
 
    @Override
	public Employee deleteEmployee(int id) {
    	Employee emp = entityManager.find(Employee.class, id);
		entityManager.remove(emp);
		return emp;
	}

    @SuppressWarnings("unchecked")
	@Override
	public List<Object> fetchAllEmployees() {
    	Query query = entityManager.createQuery("select e from Employee e");
		List<Object> list = query.getResultList();
		return list;
	}

}
