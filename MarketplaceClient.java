
import java.rmi.RMISecurityManager; 
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.lang.System;

public class MarketplaceClient 
{
	public static void main(String args[])
	{
	    System.setSecurityManager(new RMISecurityManager());
	    String display= "blank";
	    private String getRegister()
		{
		    System.out.println("Enter the Registration details : ");
		    System.out.println("Name ");
		    System.out.println("Enter User Id :");
		    System.out.println("Click the Register button Below");		   
		}
		public void addtoCart()                                                         // item added to the shopping cart
		{
			int cart_itemnum= 10210;
			System.out.println("Cart item Number :" + cart_itemnum);
			System.out.println("Item is added to your shopping cart");			
		}
		public void itemPurchase()                                                       // purchasing item description
		{
			String item= "Laptop";
			System.out.println("The item that you have purchasing is"+ item);
		}
		public String itemBrowse()                                                       // customer method
		{
			String item_name= "camera";
			System.out.println("The item that you are browing is available");					
		}
		try
		{
			String name = "//tesla.cs.iupui.edu/MarketplaceServer";
			RmiInterface obj= (RmiInterface) Naming.lookup(name);
	        System.out.println(obj.sayWelcome());	
	        System.out.println(obj.login());
	        System.out.println(obj.addItems());
	        System.out.println(obj.itemsAvaliable());
		}
		catch(Exception e)
		{
		 System.out.println("MarketplaceClient Error"+ e.getMessage());                             // message when the exception is handled
		 e.printStackTrace();                                                                        // method to handle the exception
		}
		
	}

}
