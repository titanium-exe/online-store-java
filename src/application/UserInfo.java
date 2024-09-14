package application;

import java.util.ArrayList;

public class UserInfo {
     ArrayList<String> username = new ArrayList<>();
     ArrayList<String> password = new ArrayList<>();
     UserInfo(){
    	 username.add("ekam");
    	 password.add("ekam123");
    	 username.add("gurnaj");
    	 password.add("gurnaj123");
    	 username.add("gurupdesh");
    	 password.add("guru123");
     }
	public ArrayList<String> getUsername() {
		return username;
	}
	public void setUsername(ArrayList<String> username) {
		this.username = username;
	}
	public ArrayList<String> getPassword() {
		return password;
	}
	public void setPassword(ArrayList<String> password) {
		this.password = password;
	} 
     
     
}
