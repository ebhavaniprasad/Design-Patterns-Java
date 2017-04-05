package AbstractFactory;

public abstract class AbstractMarketplace 
{	
	/* Ryan: What is the purpose of gadget/furniture here? The Abstract
				 Factory should create families of related factories that can create concrete products.*/
	//Fixed: I have created the factory of related class	
	
		   abstract public MarketplaceClients dispalyClient(String model);
		   abstract  FurnitureMarketplace displayAdmin(String item) ;
}
