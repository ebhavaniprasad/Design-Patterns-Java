package Server;

import java.io.Serializable; 

public class User implements Serializable {
	private static final long serialVersionUID = 8084523177681775893L; 
	private String roleType; 
	
	public User(String roleType) {
		this.roleType = roleType;
	}

	public String getRoleType() { 
		return roleType; 
	}
}