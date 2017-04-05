package Server;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Client.ClientView;
import Interface.BrowseInterface;
import Interface.LoginInterface;

public class BrowseItem extends UnicastRemoteObject implements BrowseInterface
{	
	public BrowseItem() throws RemoteException
	{
		super();
	}
	
	public String browseItem() throws RemoteException                                       //browse functionality for the client
	{		
		String text = " ";                                                                     //defining empty string to store the contents of file for displaying to client
		try 
		{			
			FileReader fr= new FileReader("C:/Users/ebhavaniprasad/Desktop/ProductList.txt");      // Reading the file from the local machine
			BufferedReader reader= new BufferedReader(fr);                                         // reads the content of the file line by line
			
			String line;                                                                           // local variable to hold the content of the file
	
			line = reader.readLine();                                                           // reading the content of file and storing it in a variable
			while(line!=null)
			{
				System.out.println("In while");
				text += line;                                                                         //storing to content in the variable 
				line=reader.readLine();
				text += " - ";
			}
			reader.close();			                                                                   //closing the file
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return text;		                                                                         // returns the content of the file as browsing list to the client view
	}
}
