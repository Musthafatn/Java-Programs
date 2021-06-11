package com.scg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/scg";
		String uname="root";
		String pass="root";
		String query="select * from student";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			int rollno=rs.getInt("rollno");
			String name=rs.getString("name");
			System.out.println(rollno+":"+name);
		}
		st.close();
		con.close();

	}

}
