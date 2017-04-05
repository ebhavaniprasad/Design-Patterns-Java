package Interface;


import java.rmi.*;

import Server.Session;

public interface LoginInterface extends Remote
{	
	public boolean Login(String Username, String Password) throws java.rmi.RemoteException ;
	
}
