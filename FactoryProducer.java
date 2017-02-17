


	public class FactoryProducer
	{
		   public static AbstractFactory getFactory(String itemType)
		   {		   
		      if(itemType.equalsIgnoreCase("MarketplaceCustomerPage"))
		      {
		         return new CustomerFactory();		         
		      }
		      
		      return null;
		   }
    }


