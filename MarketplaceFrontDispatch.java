

public class MarketplaceFrontDispatch
{
	       private MarketplaceDispatcher md;

		   public MarketplaceFrontDispatch()                                    //Constructor
		   {
		      md = new MarketplaceDispatcher();                                  //Dispatcher object creation
		   }
		   private boolean isAuthenticUser()
		   {
		      System.out.println("MarketplaceUser is authenticated successfully.");
		      return true;
		   }
		   public String checkUserId(String id)
		   {
			   if(id=="")
			   System.out.println("You haven't entered any login details: please enter.......");
			   return id;	   
		   }
		   public String checkPassword(String pwds)                                            // method for checking password 
		   {
			   int newPassword=Integer.parseInt(pwds);                                         //type conversion or datatype conversion
			   if(newPassword==0)                                                         //checking password format and validity
			   {
			      System.out.println("You havent enetered any password: ");
			   }
			   else 
			   {
			       System.out.println("Your login is invalid !!");
			   }
			   return pwds;
		   }
		   public String navigateTo(String page)
		   {
		      System.out.println("Page requested: " + page);
		      return page;
		   }
		   public void dispatchRequest(String request)
		   {		  
		      checkPassword(request); //checks userID
		      
		      if(isAuthenticUser())  //Authenticates users while logging
		      {
		    	 navigateTo("Customer");
		         md.dispatch(request);
		      }	
		   }
}

