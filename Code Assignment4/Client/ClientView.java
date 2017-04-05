package Client;

import java.rmi.Naming;
import Interface.BrowseInterface;

public class ClientView
{  
	BrowseInterface browseInterface = null;
	
	public ClientView()
	{
		try 
		{
			browseInterface  = (BrowseInterface)Naming.lookup("//in-csci-rrpc01.cs.iupui.edu/BrowseItem");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
	}

	public void displayView() throws Exception
	{
		System.out.println("This is the Client page");
		System.out.print("The item that you requested :");
		
		String productView = (String)browseInterface.browseItem();            //assigning the contents of the file (browsing items list) to a variable
		String[] products = productView.split(" - ");                                //splits each item with hyphen
		
		System.out.println("\n Products: "+ productView + "\n");
			
		for (String x : products)
			System.out.println(" \n The Items in your list : \n " + x + "-------- ");           //displays the browsing item list to the client

	}
}
