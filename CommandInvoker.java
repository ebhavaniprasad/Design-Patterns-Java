

public class CommandInvoker 
{
	CommandRequest cq= new CommandRequest();
	public void sendRequest()
	{
		String message;
		message=cq.userDetails();
		System.out.println("Login Successful");
	}
}	   


