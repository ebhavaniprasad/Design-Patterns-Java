
import java.rmi.RemoteException;
import java.rmi.Remote;

// Ryan: Please include usefull comments in each file.
public interface MarketplaceFrontInterface extends Remote               //extending a remote class
{
	public String getMessage() throws RemoteException;    
	public String updateItem() throws RemoteException;
	
}