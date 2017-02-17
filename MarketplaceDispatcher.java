

public class MarketplaceDispatcher 
{	
		   private CustomerView cv;                                             //instantiation of a customerview
		   private AdministratorView av;		                                 //instantiation of an administrator view
		   public MarketplaceDispatcher()                                     //creating constructor for the dispatcher 
		   {
		      CustomerView cv = new CustomerView();                                 //creating object for customer page view
		      AdministratorView av = new AdministratorView();                       //creating object for Administrator view
		   }
		   public void dispatch(String request)                                      //dispatcher method that separates view for the requests 
		   {
		      if(request.equalsIgnoreCase("customer@uid"))
		      {
		         cv.display();
		      }
		      else
		      {
		         av.display();
		      }	
		   }
}

 class CustomerView
   {
	   public void display()
	   {
		   System.out.println("Customer's authentication successful");		   		
	      System.out.println("Displaying Customer Page");
	   }
	}
class AdministratorView
   {
	   public void display()
      {
	      System.out.println("Displaying Administrator Page");
	  }
   }