package Server;

import java.io.Serializable; 

public class Session implements Serializable 
{
private static final long serialVersionUID = -6745473220581903527L;       //serializable ID

private User user; 

public Session(String userType) 
{
		user = new User(userType);
}

public User getUser()
    { 
	return user; 
	}

}