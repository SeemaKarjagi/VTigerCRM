package jDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadTheDAtaFRomDataBAse {
public static void main(String[] args) throws SQLException {
	//step1:create an instance for driver
	// driver should be imported from import com.mysql.cj.jdbc.Driver;
	////new Driver() throws SQLException
	Driver dbDriver = new Driver(); //it is provided by the db vendor
	
	
	//step2:Register to dbDriver
	//DriverManager is in java.sql.package
	DriverManager.registerDriver(dbDriver);//before connection we need to register for our jdbc
	
	//step3:Establish database connection
	// connection should be imported from java.sql packeage
	// import import java.sql.Connection;
	Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/adselenium","root","root");//(URL, UN,PWD)
	
	//step4:create staement
	//statement should imported from java.sql package
	Statement statement=connect.createStatement();
	
	//step5:Execute query to fetch data
	//import java.sql;//resultset is an interface to fetch the data we should use looop condition and  depending upon colmn name and colm value wecan fetch the data
	ResultSet result=statement.executeQuery("select * from student;");
	
	while(result.next())
	{
		System.out.println(result.getInt("id")+"\t"+result.getString("name"));
	}
	//
	//steps:6 close database
	connect.close();
	
	
	
}
}
