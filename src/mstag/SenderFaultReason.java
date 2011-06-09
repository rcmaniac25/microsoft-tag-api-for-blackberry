/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public class SenderFaultReason
{
	private static final int UNSPECIFIED_VALUE = 0;
	private static final int INVALID_ARGUMENT_VALUE = UNSPECIFIED_VALUE + 1;
	private static final int NULL_OR_EMPTY_ARGUMENT_VALUE = INVALID_ARGUMENT_VALUE + 1;
	private static final int INVALID_FORMAT_VALUE = NULL_OR_EMPTY_ARGUMENT_VALUE + 1;
	private static final int VALUE_OUT_OF_RANGE_VALUE = INVALID_FORMAT_VALUE + 1;
	private static final int OVERFLOW_VALUE = VALUE_OUT_OF_RANGE_VALUE + 1;
	
	public static final SenderFaultReason UNSPECIFIED = new SenderFaultReason(UNSPECIFIED_VALUE);
	public static final SenderFaultReason INVALID_ARGUMENT = new SenderFaultReason(INVALID_ARGUMENT_VALUE);
	public static final SenderFaultReason NULL_OR_EMPTY_ARGUMENT = new SenderFaultReason(NULL_OR_EMPTY_ARGUMENT_VALUE);
	public static final SenderFaultReason INVALID_FORMAT = new SenderFaultReason(INVALID_FORMAT_VALUE);
	public static final SenderFaultReason VALUE_OUT_OF_RANGE = new SenderFaultReason(VALUE_OUT_OF_RANGE_VALUE);
	public static final SenderFaultReason OVERFLOW = new SenderFaultReason(OVERFLOW_VALUE);
	
	protected int value;
	
	private SenderFaultReason(int value)
	{
		this.value = value;
	}
	
	protected static SenderFaultReason fromValue(String value)
	{
		if(value == null)
		{
			return null;
		}
		else if ("Unspecified".equals(value))
		{
            return UNSPECIFIED;
        }
		else if ("InvalidArgument".equals(value))
		{
            return INVALID_ARGUMENT;
        }
		else if ("NullOrEmptyArgument".equals(value))
		{
            return NULL_OR_EMPTY_ARGUMENT;
        }
		else if ("InvalidFormat".equals(value))
		{
            return INVALID_FORMAT;
        }
		else if ("ValueOutOfRange".equals(value))
		{
            return VALUE_OUT_OF_RANGE;
        }
		else if ("Overflow".equals(value))
		{
            return OVERFLOW;
        }
		throw new IllegalArgumentException();
	}
}
