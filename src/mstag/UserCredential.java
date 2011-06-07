/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

/**
 * Holds user credential data.
 */
public class UserCredential
{
	String token;
	
	/**
	 * Initializes a new instance of the UserCredential class.
	 */
	public UserCredential()
	{
	}
	
	/**
	 * Get the access token, a 64-bit encrypted GUID. This access token is assigned to the user by the Microsoft Tag team.
	 * @return 64-bit encrypted GUID that represents the access token.
	 */
	public String getAccessToken()
	{
		return this.token;
	}
	
	/**
	 * Sets the access token, a 64-bit encrypted GUID. This access token is assigned to the user by the Microsoft Tag team.
	 * @param token 64-bit encrypted GUID that represents the access token.
	 */
	public void setAccessToken(String token)
	{
		this.token = token;
	}
	
	public boolean equals(Object obj)
	{
		if(obj != null && obj instanceof UserCredential)
		{
			UserCredential cred = (UserCredential)obj;
			if(!(this.token != null ^ cred.token != null))
			{
				if(this.token != null)
				{
					return this.token.equals(cred.token);
				}
				return true; //Both tokens are null, so they are equal
			}
		}
		return false;
	}
	
	public int hashCode()
	{
		if(this.token == null)
		{
			return 0;
		}
		return this.token.hashCode();
	}
}
