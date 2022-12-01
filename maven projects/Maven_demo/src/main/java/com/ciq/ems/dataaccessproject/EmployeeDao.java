package com.ciq.ems.dataaccessproject;

import java.util.List;

import com.ciq.ems.model.Employee;

public interface EmployeeDao {
	// dao = data access object
void add(Employee employe);
void update (Employee employee);

void delete(Employee employee);

List<Employee> getAll();
}
