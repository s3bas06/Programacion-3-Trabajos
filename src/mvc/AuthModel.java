package mvc;

public class AuthModel {
	public AuthModel(){	
	}
	
	public boolean login(String username, String password) {
		if(username.equals("duki") && password.equals("goku123")) {
			return true;
		}
		return false;
	}
}
