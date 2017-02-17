
import java.rmi.RemoteException;

public class MarketplaceServerController
{
	 private MarketplaceFrontClient client;
	 private MarketplaceFrontServer server;	
	
	 public MarketplaceServerController(MarketplaceFrontServer server, MarketplaceFrontClient client)
	 {
		this.client=client;
		this.server=server;
	 }
	 public String updateItemNew() throws RemoteException
	 {
		 return server.updateItem();
	 }
	 public void displayClient() throws RemoteException
	 {
         client.updateView(server.addAdmin());		 
	 }
	
}
 