package AbstractFactory;
// Ryan: Please include useful comments in each file.
public class ClientFactory extends AbstractMarketplace
{	
		 public  MarketplaceClients getElectronics(String model)
		 {		   		      
		       if(model.equalsIgnoreCase("Cellphone"))
		       {
		         return new ClientFactoryView();
		         
		      }		      
		      return null;
		   }
		   
		   FurnitureMarketplace getFurniture(String item)
		   {
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
