package com.ciq.ems.services;

import java.util.List;

import com.ciq.ems.model.Employee;

public interface Employee_inter {
	void add(Employee employe);
	void update (Employee employee);

	void delete(Employee employee);

	List<Employee> getAll();
}
