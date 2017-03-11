package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import AbstractFactory.AbstractCommand;
import controller.FrontController;

public class LoginView 
{
	public static void main(String args[]) throws Exception 
	{
		String Username = null;
		String Password = null;
		BufferedReader br  = null;
		
		//System.setSecurityManager(new SecurityManager());
		System.out.println("Welcome to Market Place..");				
		FrontController fc = new FrontController(); 		
		do
		{	
	        	System.out.print("UserName: ");	
				br = new BufferedReader(new InputStreamReader(System.in));
				Username = (br.readLine()).toUpperCase();						
				System.out.print("Password: ");	
				br = new BufferedReader(new InputStreamReader(System.in));
				Password = br.readLine().toUpperCase();
				AbstractCommand ac=new AbstractCommand();
				ac.abstractView();
						
				fc.dispatch(Username,Password);	
				
		 	} while (1 == 1);
	}
}
