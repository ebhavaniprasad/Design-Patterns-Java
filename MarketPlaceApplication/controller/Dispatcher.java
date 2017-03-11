package controller;

import Client.AdminView;
import Client.ClientView;

public class Dispatcher
{ 
	// Ryan: Please do not embed classes like this in your code - it is a bad practice.
	//Fixed: I have not embedded classes in the dispatcher class
	
        AdminView av= new AdminView();
        ClientView cv=new ClientView();
		public void execute(String Username) throws Exception
		{	
			if(Username.equalsIgnoreCase("ADMIN"))
			{
				System.out.println("Admin View");
				try 
				{
					av.displayView();
				} 
				catch (Exception e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("The exception handled is : "+ e);					
				}
			}
			else
			{	
				System.out.println("Customer View");
				try
				{
				cv.displayView();
				}
				catch(Exception e)
				{
					e.printStackTrace();
					System.out.println("The exception is handled" + e);
				}
			}
		}
}
