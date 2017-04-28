package Server;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database
{
	private Connection con=null;
	String hostname="localhost:3306";
	String dbName="bejanthk_db";
	String url="jdbc:mysql://"+hostname+"/"+dbName;
	String username="bejanthk";
	String password="Computerscience1994";
	//System.out.println("Connecting database to the application");
	
 public Connection connection()
 {
	try 
	{ 
		//con= (Connection) DriverManger.getConnection(url,username,password);
		//Class.forName("com.mysql.jdbc.Driver");
		con= (Connection) DriverManager.getConnection(url,username,password);
		System.out.println("Connecting database to the application successful");
		
		return con;
	}
	catch(SQLException e)
	{
		System.out.println("Error" + e);
		return null;
	}
	
 }	
}
