
	public class CustomerFactory extends AbstractFactory
	{		   
		   public MarketplaceCustomerLogin getCustomerPage(String gadgetSize)
		   {		   
		      if(gadgetSize =="0")
		      {
		         return null;
		      }		
		      
		      else if(gadgetSize.equalsIgnoreCase("20"))
		      {
		         return new CustomerLogin();		         
		      }
		      
		      return null;
		   }
		   
	       MarketplaceAdministratorLogin getAdminPage(String furnitureSize)
	       {
		    return null;	
           }
		   
   }


