package jDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class UpdateData {
	
	public static void main(String[] args) throws SQLException {
		
		Driver dbDriver=new Driver();
		DriverManager.registerDriver(dbDriver);
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/adselenium","root","root");
		Statement statement=connect.createStatement();
		//int result=statement.executeUpdate("insert into student(id,name,address) values(103,'see','chennai'); ");
		int result=statement.executeUpdate("insert into student(id,name,address)values(102,'see','hyd');");
		ResultSet result1 = statement.executeQuery("select * from student;");

		//ResultSet result1 = statement.executeQuery("select * from student;");
		while(result1.next())
		{System.out.println(result1.getInt("id")+"\t"+result1.getString("name"));
		}
		
		//steps:6 close database
		connect.close();
	}}


