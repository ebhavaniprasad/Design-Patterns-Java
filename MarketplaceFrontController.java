
// Ryan: This is not an implementation of the Front Controller pattern.
public class MarketplaceFrontController
{	
		   public static void main(String[] args) throws Exception
		   {		   
			   MarketplaceFrontServer mfs= new MarketplaceFrontServer();                //creating object for the server side 
			   MarketplaceFrontClient mfcl= new MarketplaceFrontClient();               //creating object for the view or client side
			   String uid= mfcl.userId();                                               //accessing methods from client and assigning to a front controller variable
			   String pwd=mfcl.loginPassword();
		       MarketplaceFrontDispatch mfd = new MarketplaceFrontDispatch();
		       mfd.checkUserId(uid);
		       // mfd.dispatchRequest("Customer@uid");
		       mfd.dispatchRequest(pwd);                                                       //passing pwd to the dispatch method in a MarketplaceDispatch class
		   }		
}
