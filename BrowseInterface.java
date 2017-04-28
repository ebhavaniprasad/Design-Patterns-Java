package Interface;

import java.rmi.Remote;

public interface BrowseInterface extends Remote
{
	public String browseItem(String Productname) throws java.rmi.RemoteException;
		
}
