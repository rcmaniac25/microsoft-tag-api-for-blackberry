/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public class TagFault extends Exception
{
	private String errorMessage;
    private TagFaultReason reason;
    
    public TagFault(String errorMessage, TagFaultReason reason)
    {
        super(errorMessage);
        this.errorMessage = errorMessage;
        this.reason = reason;
    }
    
    public String getErrorMessage()
    {
        return errorMessage;
    }
    
    public TagFaultReason getReason()
    {
        return reason;
    }
}
