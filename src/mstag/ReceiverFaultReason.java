/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public class ReceiverFaultReason
{
	private static final int UNSPECIFIED_VALUE = 0;
	private static final int INTERNAL_ERROR_VALUE = UNSPECIFIED_VALUE + 1;
	private static final int RULE_FAILURE_VALUE = INTERNAL_ERROR_VALUE + 1;
	
	public static final ReceiverFaultReason UNSPECIFIED = new ReceiverFaultReason(UNSPECIFIED_VALUE);
	public static final ReceiverFaultReason INTERNAL_ERROR = new ReceiverFaultReason(INTERNAL_ERROR_VALUE);
	public static final ReceiverFaultReason RULE_FAILURE = new ReceiverFaultReason(RULE_FAILURE_VALUE);
	
	private int value;
	
	private ReceiverFaultReason(int value)
	{
		this.value = value;
	}
	
	protected static ReceiverFaultReason fromValue(String value)
	{
		if(value == null)
		{
			return null;
		}
		else if ("Unspecified".equals(value))
		{
            return UNSPECIFIED;
        }
		else if ("InternalError".equals(value))
		{
            return INTERNAL_ERROR;
        }
		else if ("RuleFailure".equals(value))
		{
            return RULE_FAILURE;
        }
		throw new IllegalArgumentException();
	}
}
