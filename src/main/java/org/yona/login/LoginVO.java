package org.yona.login;

public class LoginVO{

	private String ID;
	private String Password;
	private String Authority;
	private boolean Enabled;
	private String Name;
	private int FailCnt;
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAuthority() {
		return Authority;
	}
	public void setAuthority(String authority) {
		Authority = authority;
	}
	public boolean isEnabled() {
		return Enabled;
	}
	public void setEnabled(boolean enabled) {
		Enabled = enabled;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getFailCnt() {
		return FailCnt;
	}
	public void setFailCnt(int failCnt) {
		FailCnt = failCnt;
	}
	

}
