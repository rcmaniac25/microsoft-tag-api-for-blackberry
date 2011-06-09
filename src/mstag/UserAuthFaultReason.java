/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public class UserAuthFaultReason
{
	private static final int UNSPECIFIED_VALUE = 0;
	private static final int AUTHENTICATION_FAILED_VALUE = UNSPECIFIED_VALUE + 1;
	private static final int INACTIVE_USER_VALUE = AUTHENTICATION_FAILED_VALUE + 1;
	private static final int PREMIUM_TAG_CREATION_DENIED_VALUE = INACTIVE_USER_VALUE + 1;
	private static final int INSUFFICIENT_FEATURE_PERMISSION_VALUE = PREMIUM_TAG_CREATION_DENIED_VALUE + 1;
	private static final int INVALID_FEATURE_PERMISSION_VALUE = INSUFFICIENT_FEATURE_PERMISSION_VALUE + 1;
	
	public static final UserAuthFaultReason UNSPECIFIED = new UserAuthFaultReason(UNSPECIFIED_VALUE);
	public static final UserAuthFaultReason AUTHENTICATION_FAILED = new UserAuthFaultReason(AUTHENTICATION_FAILED_VALUE);
	public static final UserAuthFaultReason INACTIVE_USER = new UserAuthFaultReason(INACTIVE_USER_VALUE);
	public static final UserAuthFaultReason PREMIUM_TAG_CREATION_DENIED = new UserAuthFaultReason(PREMIUM_TAG_CREATION_DENIED_VALUE);
	public static final UserAuthFaultReason INSUFFICIENT_FEATURE_PERMISSION = new UserAuthFaultReason(INSUFFICIENT_FEATURE_PERMISSION_VALUE);
	public static final UserAuthFaultReason INVALID_FEATURE_PERMISSION = new UserAuthFaultReason(INVALID_FEATURE_PERMISSION_VALUE);
	
	protected int value;
	
	private UserAuthFaultReason(int value)
	{
		this.value = value;
	}
	
	protected static UserAuthFaultReason fromValue(String value)
	{
		if(value == null)
		{
			return null;
		}
		else if ("Unspecified".equals(value))
		{
            return UNSPECIFIED;
        }
		else if ("AuthenticationFailed".equals(value))
		{
            return AUTHENTICATION_FAILED;
        }
		else if ("InactiveUser".equals(value))
		{
            return INACTIVE_USER;
        }
		else if ("PremiumTagCreationDenied".equals(value))
		{
            return PREMIUM_TAG_CREATION_DENIED;
        }
		else if ("InsufficientFeaturePermission".equals(value))
		{
            return INSUFFICIENT_FEATURE_PERMISSION;
        }
		else if ("InvalidFeaturePermission".equals(value))
		{
            return INVALID_FEATURE_PERMISSION;
        }
		throw new IllegalArgumentException();
	}
}
