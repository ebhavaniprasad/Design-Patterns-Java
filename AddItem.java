package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import Client.ClientView;
import Interface.AddInterface;
import Interface.LoginInterface;
import java.lang.System;
import java.io.*;
public class AddItem extends UnicastRemoteObject implements AddInterface
{
	public AddItem() throws RemoteException
	{
		super();
	}	
		String hostname="localhost:3306";
		String dbName="bejanthk_db";
		String url="jdbc:mysql://"+hostname+"/"+dbName;
		String username="bejanthk";
		String password="Computerscience1994";
		// the function that checks the login details of the user 
		public synchronized String addItem(String productname) throws RemoteException    //synchronization block 
		{	
			Connection conn=null;
			try
			{
				
				conn= (Connection) DriverManager.getConnection(url, username, password);
				System.out.println("Database Connected!");
			} catch(SQLException e)
			{ 
				throw new IllegalStateException("Connection to dadtabase cant be done",e);
			}
			if(conn!= null)
			{
				Statement st=null;
				ResultSet rs=null;
				try {
					st=(Statement) conn.createStatement();
					try 
					{
						rs=st.executeQuery("Insert into Product(ProductName, Price) values('Iphone, 600')");
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
			return productname;
}
	}
