/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public class ReceiverFault extends Exception
{
	private String errorMessage;
    private ReceiverFaultReason reason;
    
    public ReceiverFault(String errorMessage, ReceiverFaultReason reason)
    {
        super(errorMessage);
        this.errorMessage = errorMessage;
        this.reason = reason;
    }
    
    public String getErrorMessage()
    {
        return errorMessage;
    }
    
    public ReceiverFaultReason getReason()
    {
        return reason;
    }
}
