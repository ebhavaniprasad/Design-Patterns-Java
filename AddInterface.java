package Interface;

import java.rmi.Remote;

public interface AddInterface extends Remote
{
	public String addItem(String productname) throws java.rmi.RemoteException;

}
