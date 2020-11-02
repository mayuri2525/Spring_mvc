package com.hefshine.employeedao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hefshine.employee.Employee;

public class EmployeeDao {

	String url="jdbc:mysql://localhost/emp";
	String username="root";
	String password="root";
	
	public boolean checkUsername(Employee emp) {
		boolean status=false;
		String sql=("select username from employee where username=?");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, username, password);
			PreparedStatement stm=con.prepareStatement(sql);
			stm.setString(1,emp.getUsername());
			//stm.setString(2, emp.getPassword());
			ResultSet rs=stm.executeQuery();
			while(rs.next()) {
				status=true;
				System.out.println("exe");
			}
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
		
		
	
}
