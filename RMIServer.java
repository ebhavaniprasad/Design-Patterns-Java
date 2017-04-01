package Server;

import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import Interface.LoginInterface;

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
		    
		    LocateRegistry.createRegistry(1099);                             //locates the rmi registry
			
			System.out.println("Starting a MarketPlace Application");

			String Login = "//localhost:1099/Login";
			Login login = new Login();			
			
			LoginInterface assignment = (LoginInterface)
					Proxy.newProxyInstance(LoginInterface.class.getClassLoader(),new Class<?>[] {LoginInterface.class},
					                new AuthorizationInvocationHandler(new Login()));        //applying proxy pattern
			
			//Binding of the newly created MarkePlace server instance to the RMI Lookup.
			Naming.rebind("Login", login);                      //rmi object binding
			
			System.out.println("MarketPlace Application Server is Ready.............!");
	}
}

