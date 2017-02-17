

public class CommandRequest 
{
	public String loginDetails;
	//CommandAdministrator ca1=new CommandAdministrator();
    public String userDetails()
    {
    	System.out.println("Login is request is succefully done");
    	CommandAdministrator ca1=new CommandAdministrator();
    	ca1.loginMessage();    	
    	return null;
    	//System.out.println("Login is request is succefully done");
    }

}
