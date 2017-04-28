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
		String item=null;
		BufferedReader br  = null;
		
		System.out.println("Welcome to Market Place..");				
		FrontController fc = new FrontController(); 	
		
		do
		{	
	        	System.out.print("UserName: ");	
				br = new BufferedReader(new InputStreamReader(System.in));
				Username = (br.readLine()).toUpperCase();	                            //takes the username from the user 					
				System.out.print("Password: ");	
				br = new BufferedReader(new InputStreamReader(System.in));
				Password = br.readLine().toUpperCase();                                //takes the password from the user
				AbstractCommand ac=new AbstractCommand();                           
				ac.abstractView();
						
				fc.dispatch(Username,Password);	                                   //dispatches the username and password to the front controller 
/*				System.out.println("Enter the item you want :");
				br= new BufferedReader(new InputStreamReader(System.in));
			    item= (br.readLine()).toUpperCase();				
*/			
		 	} while (1 == 1);
	}
}
