package Server;



import java.io.File;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Interface.LoginInterface;

public class Login extends UnicastRemoteObject implements LoginInterface
{	
	public Login() throws RemoteException
	{
		super();
	}
	// the function that checks the login details of the user 
	public boolean Login(String Username, String Password) throws RemoteException
	{	
		boolean returnFlag = false;
		
		if(Username == "ADMIN" && Password == "ADMIN")
		{
			returnFlag = true;
		}
		else if(Username == "BHAVANI" && Password == "PRASAD")
		{
			returnFlag = true;
		}
		else
		{
			returnFlag = false;
		}

		return returnFlag;
	}

}
