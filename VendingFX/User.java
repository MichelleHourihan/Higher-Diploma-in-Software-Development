package Vendingfx;

/*A User class that has a username and password
 * 
 */
public class User {
	protected String username;
	protected String password;
	private String type;

	//////////////////////////////////////////////////////////////////////
	public User() {

	}

	// constructor that takes in the chosen username and password
	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.type = null;

		////
	}
/////////////////////////////////////////////////////////////////////////

	
////////////////////////////////////////////////////////////////////////////////////

	public void setUsername(String username) {
		this.username = username;
	}

///////////////////////////////////////////////////////////////////////////////////

	public String getUsername() {
		return this.username;
	}

	////////////////////////////////////////////////////////////////////////////////////
	public String getUserPassword() {
		return this.password;
	}
/////////////////////////////////////////////////////////////////////////////////////

	public boolean authenticate(String username, String password) {
		boolean match = false;

		if (this.username.equals(username) && this.password.equals(password)) {

			match = true;
		}
		return match;
	}

//////////////////////////////////////////////////////////////////////////////////////
	public String toString() {
		return this.username + " " + this.password;
	}

	///////////////////////////////////////////////////////////////////////////////////
	

	////////////////////////////////////////////////////////////////////////////////////
	public String getUserType() {

		return type;
	}
	//////////////////////////////////////////////////////////////////////////
}