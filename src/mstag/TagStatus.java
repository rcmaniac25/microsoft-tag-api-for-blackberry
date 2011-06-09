/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public final class TagStatus
{
	private static final int ACTIVE_VALUE = 0;
	private static final int PAUSED_VALUE = ACTIVE_VALUE + 1;
	private static final int DELETE_VALUE = PAUSED_VALUE + 1;
	
	public static final TagStatus ACTIVE = new TagStatus(ACTIVE_VALUE);
	public static final TagStatus PAUSED = new TagStatus(PAUSED_VALUE);
	public static final TagStatus DELETE = new TagStatus(DELETE_VALUE);
	
	protected int value;
	
	private TagStatus(int value)
	{
		this.value = value;
	}
}
