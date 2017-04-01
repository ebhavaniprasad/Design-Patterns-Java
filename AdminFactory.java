package AbstractFactory;
// Ryan: Please include useful comments in each file.
public class AdminFactory extends AbstractMarketplace
{		  
		   public MarketplaceClients getClient(String model)
		   {
		      return null;
		   }
		   
		   FurnitureMarketplace getFurniture(String item) 
		   {
		   
		      if(item == null)
		      {
		         return null;
		      }		
		      
		      
		      else if(item.equalsIgnoreCase("Client2"))
		      {
		         return new AdminFactoryView();
		         
		      }
		      
		      return null;
		   }

		@Override
		public MarketplaceClients dispalyClient(String model) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		FurnitureMarketplace displayAdmin(String item) {
			// TODO Auto-generated method stub
			return null;
		}
	
		}

		

		

