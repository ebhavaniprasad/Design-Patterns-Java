

public class CommandAdministrator implements MarketplaceCommandInterface
{
	MarketplaceFrontClient mfc=new MarketplaceFrontClient();
	public String loginMessage()
	{
		 //CommandRequest cr1= new CommandRequest();
		System.out.println("Admin login is successful");
		return null;
	}	
	public void login()
	{
		String uid1=mfc.userId();
		String pwd1=mfc.loginPassword();
		if(uid1=="@admin")
		  System.out.println("If admin username has @admin then it is valid uid:");
		if(pwd1=="12345678")
			loginMessage();		
	}
}

