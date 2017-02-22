
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RMISecurityManager;

// Ryan: Please include usefull comments in each file.
public class MarketplaceServer extends UnicastRemoteObject implements RmiInterface // Remote Server class implementing the RMI interface
{
	// Ryan: Should these methods really go in the Server class - or should they go in classes
	// related to their intended functionality?
	String password;
	public MarketplaceServer() throws RemoteException // Constructor throwing RemoteException
	{
		
	}
	public String sayWelcome() // defining of method
	{
	return("Welcome to the Marketplace");	
	}
	
	public String login()
	{    
		String uid="john@mp";		
		System.out.println("login Successful");
		return(uid);
	}
	public void addtoCart()
	{
		int cart_itemnum= 10210;
		System.out.println("Cart item Number : " + cart_itemnum);
		System.out.println("Item added to shopping cart");
	}
	 public String addItems()
	 {
		 String new_item= "Crockery";
		 return(new_item);
	 }
     public String resetPassword(String password)
     {
    	 System.out.println("the new password is: "+ password);
    	 return(password);
    	 
     }
	
	public void itemsAvailable() // items available for client
	{
	  int available_items=100;
	  int customer_items=120;
	  int x= available_items-customer_items;
	  if(available_items < customer_items)
		  System.out.println("Items are not available, please items select again");
	  else
		  System.out.println("Still"+ x +"are available");
	}
	 
	public double updateItems()
	{
		int price_item= 2000;
		double tax_item= 15.4;
		double total= price_item + tax_item;		
		System.out.println("price of an item :"+ total);
		return(total);
	}
	
     
	public static void main(String args[]) // main method 
	{
		System.setSecurityManager(new RMISecurityManager());
		try 
		{
			MarketplaceServer obj= new MarketplaceServer(); // Object Creation
			Naming.rebind("HelloMarketplaceServer", obj);             
		}
		catch(Exception e) // catch block to handle exceptions
		{
			System.out.println("MarketplaceServer Error : "+ e.getMessage());
		    e.printStackTrace();
		}
	}
}
