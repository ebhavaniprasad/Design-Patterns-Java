

public class MarketplaceController 
        {		
		   public static void main(String[] args)
		   {

		      //to fetch the customer database
		      MarketplaceServer ms = retriveFromCustomerRecords();
		      MarketplaceClient MC= new MarketplaceClient();        // object creation for the client
		      MarketplaceController mc = new MarketplaceController(mc, MC);	    
		   }

		   private static MarketplaceServer retrieveFromCustomerRecords()
		   {
		      MarketplaceServer ms = new MarketplaceServer();        // creating the server class object or remote object
		      MarketplaceServer.resetPassword("Robinhood23");		// reset the password     
		      return ms;
		   }
	
		}

