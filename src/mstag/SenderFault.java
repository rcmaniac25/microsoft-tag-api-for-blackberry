/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public class SenderFault extends Exception
{
	private String errorMessage;
    private SenderFaultReason reason;
    
    public SenderFault(String errorMessage, SenderFaultReason reason)
    {
        super(errorMessage);
        this.errorMessage = errorMessage;
        this.reason = reason;
    }
    
    public String getErrorMessage()
    {
        return errorMessage;
    }
    
    public SenderFaultReason getReason()
    {
        return reason;
    }
}
