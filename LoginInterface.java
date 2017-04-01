package Interface;


import java.rmi.*;

import Server.Session;
// Ryan: Please include useful comments in each file.
public interface LoginInterface extends Remote
{	
	public boolean Login(String Username, String Password) throws java.rmi.RemoteException ;
}
