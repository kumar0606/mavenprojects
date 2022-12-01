package com.ciq.ems.dataaccessproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.ciq.ems.model.Employee;
import com.ciq.ems.queries.EmployeeQueries;
import com.ciq.ems.util.ConnectionUtil;

public class EmployeeDao_Impl implements EmployeeDao{

	public void add(Employee employe) {
//		Connection con=null;
//		PreparedStatement st=null;
		try {
			Connection con=ConnectionUtil.getConnection();
			 PreparedStatement	st=con.prepareStatement(EmployeeQueries.INSERT_EMP);
			st.setInt(1, employe.getId());
			st.setString(2, employe.getName());
			st.setDouble(3, employe.getSalary());
			int i=st.executeUpdate();
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
