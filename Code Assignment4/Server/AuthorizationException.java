package Server;

public class AuthorizationException extends RuntimeException 
{

	private static final long serialVersionUID = 5528415690278423524L; 

	public AuthorizationException(String methodName)
	{
		super("Invalid Authorization - Access Denined to " + methodName + "() function!"); 
	}
	
}