package Interface;

import java.rmi.Remote;

public interface BrowseInterface extends Remote
{
	public String browseItem() throws java.rmi.RemoteException;
}
