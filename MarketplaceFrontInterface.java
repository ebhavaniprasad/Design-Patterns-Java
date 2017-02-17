
import java.rmi.RemoteException;
import java.rmi.Remote;

public interface MarketplaceFrontInterface extends Remote               //extending a remote class
{
	public String getMessage() throws RemoteException;    
	public String updateItem() throws RemoteException;
	
}