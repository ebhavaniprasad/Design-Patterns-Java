package Client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Naming;

import Interface.AddInterface;
import Interface.BrowseInterface;

public class AdminView
{  
	BrowseInterface browseInterface = null;
	AddInterface addInterface = null;
	BufferedReader br  = null;
	
	public AdminView()
	{
		try 
	  {
		browseInterface  = (BrowseInterface)Naming.lookup("//in-csci-rrpc01.cs.iupui.edu:2907/BrowseItem");
	  } 
	catch (Exception e) 
	 {
		e.printStackTrace();
	 } 
	}

	//BrowseInterface browse= new BrowseInterface();
	public void displayView() throws Exception
	{
		System.out.println("This is the ADMIN page");
		String input= null;
		
		
		System.out.println("1. browse 2. Add Items");
		br = new BufferedReader(new InputStreamReader(System.in));
		input = (br.readLine());	  
		
		System.out.print("ProductName: ");	
		br = new BufferedReader(new InputStreamReader(System.in));
		String productname = (br.readLine()).toUpperCase();	                            //takes the username from the user 					

		
		if(input == "0")
		{
			String productView = (String)browseInterface.browseItem(productname);            //assigning the contents of the file (browsing items list) to a variable
			String[] products = productView.split(" - ");                                //splits each item with hyphen
			
			System.out.println("\n Products: "+ productView + "\n");
				
			for (String x : products)
				System.out.println(" \n The Items in your list : \n " + x + "-------- ");           //displays the browsing item list to the client

		}
		else if(input == "1")
		{
			String output = (String)addInterface.addItem(productname);
			
			if(output == "1")
			{
				System.out.println("Item dded to List Successfully.");
			}
			else
			{
				System.out.println("Exception Occured");
			}
			
		}
		else
		{
			
			System.out.println("Wrong Choice");

		}
		

	}
}
