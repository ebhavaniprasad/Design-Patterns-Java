package Server;



import java.io.File;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import Interface.LoginInterface;

public class Login extends UnicastRemoteObject implements LoginInterface
{	
	public Login() throws RemoteException
	{
		super();
	}
	String hostname="localhost:3306";
	String dbName="bejanthk_db";
	String url="jdbc:mysql://"+hostname+"/"+dbName;
	String username="bejanthk";
	String password="Computerscience1994";
	// the function that checks the login details of the user 
	public boolean Login(String username, String password) throws RemoteException
	{	
		Connection conn=null;
		try{
			conn= (Connection) DriverManager.getConnection(url, username,password);
			System.out.println("Database Connected!");
		} catch(SQLException e)
		{
			throw new IllegalStateException("Connection to dadtabase cant be done",e);
			
		}
		if(conn!= null)
		{
			Statement st=null;
			ResultSet rs=null;
			try{
				st=(Statement) conn.createStatement();
				try 
				{
					rs=st.executeQuery("Select * from Login where Username = '"+ username +"' AND Password = '" + password + "'");
						while(rs.next())
						{
							return true;
						}
					}
					catch(SQLException e)
					{
						return false;
                      
					}
					st.close();
				} 
				catch(SQLException e1)
				{
					System.err.println("Unable to create SQL statement");
					e1.printStackTrace();				
					
				}
			}
		return false;
		}
	}


