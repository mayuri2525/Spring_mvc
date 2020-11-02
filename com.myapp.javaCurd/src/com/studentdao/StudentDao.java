package com.studentdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {

	String url = "jdbc:mysql://localhost/un";
	String username = "root";
	String password = "root";

	void fetch() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from Student");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	void saveRecord(Student st) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement stm = con.prepareStatement("insert into student values(?,?)");
			// values from users
			stm.setInt(1,st.getRollNo());
			stm.setString(2,st.getName());
			//values from hardcoded
			//stm.setInt(2, 5);
			//stm.setString(2, "rucha");
			System.out.println("data save succesfully");
			// excute the query
			int executeUpdate = stm.executeUpdate();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void deleteRecord(Student st) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement stm = con.prepareStatement("delete from  student where rollNo=?");
			// values from hardcoded
			//stm.setInt(1, 4);
			//values from user
			stm.setInt(1,st.getRollNo());
			int executeUpdate = stm.executeUpdate();
			System.out.println("data delete succesfully");
			// excute the query
			
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void updateRecord(Student st) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement stm = con.prepareStatement("update student set name=? where rollNo=?");
			// values from hardcoded
//			stm.setString(1, "ram");
			//stm.setInt(2, 1);
			// values from user
			stm.setString(1, st.getName());
			stm.setInt(2, st.getRollNo());
			int executeUpdate = stm.executeUpdate();
			System.out.println("data update succesfully");
			// excute the query
			
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
