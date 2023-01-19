package jDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModifyDB {
	
 
	public static void main(String[] args) throws SQLException {
		//step1:create an instance for driver
		// driver should be imported from import com.mysql.cj.jdbc.Driver;
		////new Driver() throws SQLException
	    //Driver dbDriver = new Driver(); //it is provided by the db vendor inorder to connect with jdbc we need to register for the connection
		
		 Driver dbDriver = new com.mysql.jdbc.Driver();
		 
		//step2:Register to dbDriver
		//DriverManager is in java.sql.package
		DriverManager.registerDriver(dbDriver);//before connection we need to registern for our jdbc
		
		//step3:Establish database connection
		// connection should be imported from java.sql packeage
		// import import java.sql.Connection;
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/adselenium","root","root");//(URL, UN,PWD)
		
		//step4:create staement
		//statement should imported from java.sql package
		Statement statement=connect.createStatement();
		
		//step5:Execute query to fetch data
		//import java.sql;//resultset is an interface to fetch the data we should use looop condition and  depending upon colmn name and colm value wecan fetch the data
		int result=statement.executeUpdate("insert into student(id,name,address)values(102,'see','hyd');");
		ResultSet result1 = statement.executeQuery("select * from student;");
		
		if(result==1)
		{System.out.println("db updated successfully");
		}
		else {
			System.out.println("db is not updated");
		}
		
		while(result1.next())
		{System.out.println(result1.getInt("id")+"\t"+result1.getString("name"));
		}
		
		//steps:6 close database
		connect.close();
	}}
		
		
		
	
	





