

import java.rmi.Naming;
import java.rmi.registry.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MarketplaceFrontServer extends UnicastRemoteObject implements MarketplaceFrontInterface
{
	//public int customerId=2018;
	//public String discardItem;
	public String newAdmin="John";
	public String newItem="Gadgets";
	//public String alert="item is removed";
	public static final String MESSAGE = "Hello World";
	public MarketplaceFrontServer() throws RemoteException           //Constructor throws RemoteException
	{
		super(0);                                     
	}
	
	public String getMessage() throws RemoteException
	{
		return MESSAGE;
	}
	public String updateItem() throws RemoteException  //implemented
	{
		return newItem;
	}
	public String addAdmin() throws RemoteException                 //implemented
	{
	    	return newAdmin;
	}
	/*public void removeCustomer() throws RemoteException
	{
		
		if (customerId == 2018)
			System.out.println("customer is removed from marketplace");
		else 
			System.out.println("Customer is not removed from marketplace");		
	}
	public String removeItem(String discardItem) throws RemoteException
	{			
		this.discardItem= discardItem;
		return discardItem;
	}
	public String addCustomer(String addCustomer) throws RemoteException
	{		
		return addCustomer;
	}*/
		
	public static void main(String args[]) throws Exception
	{
		try
		{
			LocateRegistry.createRegistry(1099);                    //loacting Rmiregistry
			System.out.println("Registry is created");
		}
		catch(Exception e)
		{
	        System.out.println("registry already exists");		
		}
		
		MarketplaceFrontServer obj= new MarketplaceFrontServer();
		Naming.rebind("ServerObject", obj);              // Rebinding the remote Object
		System.out.println("name rebinded");
	}
}