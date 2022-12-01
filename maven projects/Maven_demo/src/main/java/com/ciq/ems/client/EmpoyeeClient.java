package com.ciq.ems.client;

import com.ciq.ems.dataaccessproject.EmployeeDao_Impl;
import com.ciq.ems.model.Employee;
import com.ciq.ems.services.Employee_serv;

public class EmpoyeeClient {
	public static void main(String[] args) {
		Employee emp=new Employee(13, "ravi", 1569.00);
		Employee_serv e=new Employee_serv();
		e.add(emp);
		System.out.println(e);
	}

}
