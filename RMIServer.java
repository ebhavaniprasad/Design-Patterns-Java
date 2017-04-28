package Server;

import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import Interface.BrowseInterface;
import Interface.LoginInterface;
import Interface.AddInterface;

public class RMIServer extends UnicastRemoteObject 
{	
	public RMIServer() throws RemoteException              
	{
		super(); 
	}
	
	public static void main(String args[]) throws Exception 
	{
		// Ryan: A better approach would be to isolate the RMI components from the Application Logic
		// Fixed: I have separated the application logic from the RMI implementation
		    
		   // LocateRegistry.createRegistry(1099);                             //locates the rmi registry
		    System.setSecurityManager(new SecurityManager());
			System.out.println("Starting a MarketPlace Application");

			String Login = "//in-csci-rrpc01.cs.iupui.edu:2907/Login";
			String BrowseItem="//in-csci-rrpc01.cs.iupui.edu:2907/BrowseItem"; 
			String AddItem="//in-csci-rrpc01.cs.iupui.edu:2907/AddItem"; 
			
            AddItem add= new AddItem();
			BrowseItem browse=new BrowseItem();
			Login login = new Login();			
			
//		LoginInterface assignment = (LoginInterface)
	//				Proxy.newProxyInstance(LoginInterface.class.getClassLoader(),new Class<?>[] {LoginInterface.class},
		//			                new AuthorizationInvocationHandler(new Login()));        //applying proxy pattern
//			
//			//Binding of the newly created MarkePlace server instance to the RMI Lookup.
//			
//			BrowseInterface assignment2 = (BrowseInterface)
//					Proxy.newProxyInstance(BrowseInterface.class.getClassLoader(),new Class<?>[] {BrowseInterface.class},
//					                new AuthorizationInvocationHandler(new BrowseItem()));
//			// updateinterface binding........
//			
//			AddInterface assignment3 = (AddInterface)
//					Proxy.newProxyInstance(AddInterface.class.getClassLoader(),new Class<?>[] {AddInterface.class},
//					                new AuthorizationInvocationHandler(new AddItem()));
			
			Naming.rebind("Login", login);
			Naming.rebind("BrowseItem", browse);
			Naming.rebind("AddItem", add);
			
			
			
			
			System.out.println("MarketPlace Application Server is Ready.............!");
			
			//assignment2.getData();
			
	}
}

