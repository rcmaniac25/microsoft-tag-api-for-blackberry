/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public class CategoryFaultReason
{
	private static final int UNSPECIFIED_VALUE = 0;
	private static final int DUPLICATE_NAME_VALUE = UNSPECIFIED_VALUE + 1;
	private static final int NOT_FOUND_VALUE = DUPLICATE_NAME_VALUE + 1;
	private static final int INVALID_STATUS_VALUE = NOT_FOUND_VALUE + 1;
	private static final int BLOCKED_VALUE = INVALID_STATUS_VALUE + 1;
	private static final int CASCADE_DELETE_VALUE = BLOCKED_VALUE + 1;
	private static final int DEFAULT_CATEGORY_DELETE_VALUE = CASCADE_DELETE_VALUE + 1;
	private static final int RANGE_SEARCH_NOT_SUPPORTED_VALUE = DEFAULT_CATEGORY_DELETE_VALUE + 1;
	
	public static final CategoryFaultReason UNSPECIFIED = new CategoryFaultReason(UNSPECIFIED_VALUE);
	public static final CategoryFaultReason DUPLICATE_NAME = new CategoryFaultReason(DUPLICATE_NAME_VALUE);
	public static final CategoryFaultReason NOT_FOUND = new CategoryFaultReason(NOT_FOUND_VALUE);
	public static final CategoryFaultReason INVALID_STATUS = new CategoryFaultReason(INVALID_STATUS_VALUE);
	public static final CategoryFaultReason BLOCKED = new CategoryFaultReason(BLOCKED_VALUE);
	public static final CategoryFaultReason CASCADE_DELETE = new CategoryFaultReason(CASCADE_DELETE_VALUE);
	public static final CategoryFaultReason DEFAULT_CATEGORY_DELETE = new CategoryFaultReason(DEFAULT_CATEGORY_DELETE_VALUE);
	public static final CategoryFaultReason RANGE_SEARCH_NOT_SUPPORTED = new CategoryFaultReason(RANGE_SEARCH_NOT_SUPPORTED_VALUE);
	
	protected int value;
	
	private CategoryFaultReason(int value)
	{
		this.value = value;
	}
	
	protected static CategoryFaultReason fromValue(String value)
	{
		if(value == null)
		{
			return null;
		}
		else if ("Unspecified".equals(value))
		{
            return UNSPECIFIED;
        }
		else if ("DuplicateName".equals(value))
		{
            return DUPLICATE_NAME;
        }
		else if ("NotFound".equals(value))
		{
            return NOT_FOUND;
        }
		else if ("InvalidStatus".equals(value))
		{
            return INVALID_STATUS;
        }
		else if ("Blocked".equals(value))
		{
            return BLOCKED;
        }
		else if ("CascadeDelete".equals(value))
		{
            return CASCADE_DELETE;
        }
		else if ("DefaultCategoryDelete".equals(value))
		{
            return DEFAULT_CATEGORY_DELETE;
        }
		else if ("RangeSearchNotSupported".equals(value))
		{
            return RANGE_SEARCH_NOT_SUPPORTED;
        }
		throw new IllegalArgumentException();
	}
}
