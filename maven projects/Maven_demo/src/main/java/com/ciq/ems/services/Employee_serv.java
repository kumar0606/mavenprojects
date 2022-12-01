package com.ciq.ems.services;

import java.util.List;

import com.ciq.ems.dataaccessproject.EmployeeDao_Impl;
import com.ciq.ems.model.Employee;

public class Employee_serv implements Employee_inter {
 EmployeeDao_Impl dao=new EmployeeDao_Impl();
 
	public void add(Employee employe) {
		dao.add(employe);
		
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
