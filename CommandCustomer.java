
public class CommandCustomer 
{
	MarketplaceFrontClient mfc=new MarketplaceFrontClient();
	public String loginMessage()
	{
		 //CommandRequest cr1= new CommandRequest();
		System.out.println("Customer login is successful");
		return null;
	}	
	public void login()
	{
		String uid1=mfc.userId();
		String pwd1=mfc.loginPassword();
		if(uid1=="@customer")
		  System.out.println("If admin username has @admin then it is valid uid:");
		if(pwd1=="12345678")
			loginMessage();		
	}
}
