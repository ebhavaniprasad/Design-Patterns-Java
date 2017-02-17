
import java.rmi.Naming;

public class MarketplaceFrontClient 
{
	public String userId()                                 //Login Id method
	{
		System.out.println("Enter the userId:");
		String userId= System.console().readLine();
	    return userId;
	}
	public String loginPassword()                            //method for user Login password 
	{
		System.out.println("Enter the password:");
		String password= System.console().readLine();
		return password;
	}
	public void updateView(String newAdmin)                     //method for receiving data from MarketplaceServerController class
	{
		System.out.println("New Admin"+ newAdmin);
	}
	public static void main(String args[]) throws Exception
	{
		MarketplaceFrontInterface obj=(MarketplaceFrontInterface) Naming.lookup("ServerObject");                        //lookup method for viewing in client
		System.out.println(obj.getMessage());   		                                                                //remoteprocedural call
	}
	
	
}
