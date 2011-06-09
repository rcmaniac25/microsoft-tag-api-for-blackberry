/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public class TagFaultReason
{
	private static final int UNSPECIFIED_VALUE = 0;
	private static final int DUPLICATE_NAME_VALUE = UNSPECIFIED_VALUE + 1;
	private static final int NOT_FOUND_VALUE = DUPLICATE_NAME_VALUE + 1;
	private static final int INVALID_STATUS_VALUE = NOT_FOUND_VALUE + 1;
	private static final int PAUSED_VALUE = INVALID_STATUS_VALUE + 1;
	private static final int BLOCKED_VALUE = PAUSED_VALUE + 1;
	private static final int FROZEN_VALUE = BLOCKED_VALUE + 1;
	private static final int FOUR_ROW_BARCODE_LIMIT_EXCEED_VALUE = FROZEN_VALUE + 1;
	private static final int INVALIDE_TAG_TYPE_VALUE = FOUR_ROW_BARCODE_LIMIT_EXCEED_VALUE + 1;
	private static final int DATES_CONFLICT_VALUE = INVALIDE_TAG_TYPE_VALUE + 1;
	private static final int PROPERTY_UPDATE_NOT_ALLOWED_VALUE = DATES_CONFLICT_VALUE + 1;
	private static final int RANGE_SEARCH_NOT_SUPPORTED_VALUE = PROPERTY_UPDATE_NOT_ALLOWED_VALUE + 1;
	
	public static final TagFaultReason UNSPECIFIED = new TagFaultReason(UNSPECIFIED_VALUE);
	public static final TagFaultReason DUPLICATE_NAME = new TagFaultReason(DUPLICATE_NAME_VALUE);
	public static final TagFaultReason NOT_FOUND = new TagFaultReason(NOT_FOUND_VALUE);
	public static final TagFaultReason INVALID_STATUS = new TagFaultReason(INVALID_STATUS_VALUE);
	public static final TagFaultReason PAUSED = new TagFaultReason(PAUSED_VALUE);
	public static final TagFaultReason BLOCKED = new TagFaultReason(BLOCKED_VALUE);
	public static final TagFaultReason FROZEN = new TagFaultReason(FROZEN_VALUE);
	public static final TagFaultReason FOUR_ROW_BARCODE_LIMIT_EXCEED = new TagFaultReason(FOUR_ROW_BARCODE_LIMIT_EXCEED_VALUE);
	public static final TagFaultReason INVALIDE_TAG_TYPE = new TagFaultReason(INVALIDE_TAG_TYPE_VALUE);
	public static final TagFaultReason DATES_CONFLICT = new TagFaultReason(DATES_CONFLICT_VALUE);
	public static final TagFaultReason PROPERTY_UPDATE_NOT_ALLOWED = new TagFaultReason(PROPERTY_UPDATE_NOT_ALLOWED_VALUE);
	public static final TagFaultReason RANGE_SEARCH_NOT_SUPPORTED = new TagFaultReason(RANGE_SEARCH_NOT_SUPPORTED_VALUE);
	
	protected int value;
	
	private TagFaultReason(int value)
	{
		this.value = value;
	}
	
	protected static TagFaultReason fromValue(String value)
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
		else if ("Paused".equals(value))
		{
            return PAUSED;
        }
		else if ("Blocked".equals(value))
		{
            return BLOCKED;
        }
		else if ("Frozen".equals(value))
		{
            return FROZEN;
        }
		else if ("FourRowBarcodeLimitExceed".equals(value))
		{
            return FOUR_ROW_BARCODE_LIMIT_EXCEED;
        }
		else if ("InvalidTagType".equals(value))
		{
            return INVALIDE_TAG_TYPE;
        }
		else if ("DatesConflict".equals(value))
		{
            return DATES_CONFLICT;
        }
		else if ("PropertyUpdateNotAllowed".equals(value))
		{
            return PROPERTY_UPDATE_NOT_ALLOWED;
        }
		else if ("RangeSearchNotSupported".equals(value))
		{
            return RANGE_SEARCH_NOT_SUPPORTED;
        }
		throw new IllegalArgumentException();
	}
}
