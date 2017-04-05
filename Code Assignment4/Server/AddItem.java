package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Client.ClientView;
import Interface.AddInterface;
import Interface.LoginInterface;
import java.lang.System;
import java.io.*;
public class AddItem extends UnicastRemoteObject implements AddInterface
{
	
	public AddItem() throws RemoteException
	{
		super();
	}	
	public String addItem() throws RemoteException              //admin add items functionality
	{
	try
	{
		FileWriter fw= new FileWriter("C:/Users/ebhavaniprasad/Desktop/ProductList.txt");      // writes the file as an admin adding the item
		BufferedWriter bw= new BufferedWriter(fw);
		System.out.println("ITEMS ADDED BY ADMIN");
		bw.write(" Books: Harry Potter, Alchemist, The Truth");                   //adds the items to the file
		bw.newLine();
		bw.write("Clothes: Lee, Wrangler, Pepe Jeans");
		bw.newLine();
		bw.write(" Food ITEMS: Fruits, Vegetable, Snacks");
		bw.close();		
		return "1";			
	}
		catch (Exception e)
		{
			System.out.println("The File Writing Exception error is :" + e);
			return "0";			
		}

	}
	
}
