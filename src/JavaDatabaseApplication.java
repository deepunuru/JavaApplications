import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaDatabaseApplication{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = null;
			Statement stat = null;
			
			/*con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?autoReconnect=true&useSSL=false","root","4774");
			stat = con.createStatement();
			stat.executeUpdate("create database Database1");
			System.out.println("\nDatabase - Database1 created Successfully");*/
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Database1?useSSL=false","root","4774");
			
			/*
			System.out.println("Creating table in Database1");
			stat = con.createStatement();
			stat.executeUpdate("create table employee(id INTEGER NOT NULL,firstname VARCHAR(40),lastname varchar(40),PRIMARY KEY(id))");
			System.out.println("Table - employee created successfully");
			*/
			
			System.out.println("Inserting rows into employee Table");
			stat = con.createStatement();
			
			stat.executeUpdate("update employee set firstname='Danny',lastname = 'Pope' where id=1");
			
			System.out.println("Row update complete");
			con.close();
			
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
			System.out.println("\n" + ex.getMessage());
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}