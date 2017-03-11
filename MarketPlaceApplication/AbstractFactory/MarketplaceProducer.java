package AbstractFactory;

public class MarketplaceProducer
{	
		   public static AbstractMarketplace getFactory(String option){
		   
		      if(option.equalsIgnoreCase("Client View Page"))
		      {
		         return new ClientFactory();
		         
		      }
		      else if(option.equalsIgnoreCase("Admin View Page"))
		      {
		         return new AdminFactory();
		      }
		      
		      return null;
		   }
}
