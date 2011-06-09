/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public class CategoryFault extends Exception
{
	private String errorMessage;
    private CategoryFaultReason reason;
    
    public CategoryFault(String errorMessage, CategoryFaultReason reason)
    {
        super(errorMessage);
        this.errorMessage = errorMessage;
        this.reason = reason;
    }
    
    public String getErrorMessage()
    {
        return errorMessage;
    }
    
    public CategoryFaultReason getReason()
    {
        return reason;
    }
}
