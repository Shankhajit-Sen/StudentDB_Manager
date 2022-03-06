package com.studentmanagement.app.maven_archetype_quickstart.com.studentmanagement.app.maven_archetype_quickstart;
import java.sql.Connection;
import java.sql.DriverManager;

public class connectingdb {
	static Connection con;
	public static Connection CreateC() {
		try {

	      // register MySQL thin driver with DriverManager service
	      // It is optional for JDBC4.x version
	      Class.forName("com.mysql.cj.jdbc.Driver");

	      // variables
	      String url = "jdbc:mysql://localhost:3306/studentlist";
	      String user = "root";
	      String password = "root";

	      // establish the connection
	      con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
	   } 
		return con;
	}
}