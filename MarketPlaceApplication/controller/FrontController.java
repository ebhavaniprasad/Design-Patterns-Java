package controller;



import java.rmi.Naming;
import java.rmi.RemoteException;

import Interface.LoginInterface;

public class FrontController
{
	// Ryan: This is not an implementation of the Front Controller pattern.
	// Fixed: I have reconstructed the Front Controller pattern
	Dispatcher dispatcher;
	LoginInterface loginInterface;
	
	public FrontController() throws Exception
	{
		this.loginInterface = (LoginInterface)Naming.lookup("//localhost:1099/Login"); 
	}
	
	public void dispatch(String Username, String Password) throws Exception
	{
		 boolean returnFlag = false;
		 returnFlag = loginInterface.Login(Username, Password);
		 dispatcher = new Dispatcher();
		 
		 if(returnFlag)
		 {
			 dispatcher.execute(Username);
		 }
		 else
		 {
			 dispatcher.execute(Username);
			 //System.out.println("Username and Password Wrong..!");
		 }
	 }	
}
