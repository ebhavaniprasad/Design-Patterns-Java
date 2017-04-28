package Server;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;

import Client.ClientView;
import Interface.BrowseInterface;
import Interface.LoginInterface;

public class BrowseItem extends UnicastRemoteObject implements BrowseInterface
{		
	public BrowseItem() throws RemoteException
	{
		super();		
	}
	
	String hostname="localhost:3306";
	String dbName="bejanthk_db";
	String url="jdbc:mysql://"+hostname+"/"+dbName;
	String username="bejanthk";
	String password="Computerscience1994";
	// the function that checks the login details of the user 
	public synchronized String browseItem(String productname) throws RemoteException   //Synchronize block 
	{	
		Connection conn=null;
		try{
			conn= (Connection) DriverManager.getConnection(url, username,password );
			System.out.println("Database Connected!");
		} catch(SQLException e)
		{
			throw new IllegalStateException("Connection to database cant be done",e);
			
		}
		if(conn!= null)
		{
			Statement st=null;
			ResultSet rs=null;
			try {
				st=(Statement) conn.createStatement();
				try 
				{
					rs=st.executeQuery("Select * from Product where ProductName = '"+ productname +"'");
					while(rs.next())
					{
							//return true;
						String productName=rs.getString("ProductName");
						int price11= rs.getInt("Price");
						String value =  productName + "|" + Integer.toString(price11);
						System.out.println("Price" + price11);
						System.out.println("ProductName"+productName);
						return value;
					 }
				}
					catch(SQLException e)
					{
						//return false;
						System.out.println(" Exception occured!"+ e);
						return null;
					}
					st.close();	
					return null;
				} 
				catch(SQLException e1)
				{
					System.err.println("Unable to create SQL statement");
					e1.printStackTrace();				
					return null;

				}
			}
		return null;
		}
}
