package Interface;

import java.rmi.Remote;

public interface AddInterface extends Remote
{
	public String addItem() throws java.rmi.RemoteException;

}
