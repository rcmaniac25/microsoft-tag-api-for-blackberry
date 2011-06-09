/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public class UserAuthFault extends Exception
{
	private String errorMessage;
    private UserAuthFaultReason reason;
    
    public UserAuthFault(String errorMessage, UserAuthFaultReason reason)
    {
        super(errorMessage);
        this.errorMessage = errorMessage;
        this.reason = reason;
    }
    
    public String getErrorMessage()
    {
        return errorMessage;
    }
    
    public UserAuthFaultReason getReason()
    {
        return reason;
    }
}
