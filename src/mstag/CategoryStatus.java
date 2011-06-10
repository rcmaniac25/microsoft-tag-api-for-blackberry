/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public final class CategoryStatus
{
	private static final int ACTIVE_VALUE = 0;
	private static final int PAUSED_VALUE = ACTIVE_VALUE + 1;
	
	public static final CategoryStatus ACTIVE = new CategoryStatus(ACTIVE_VALUE);
	public static final CategoryStatus PAUSED = new CategoryStatus(PAUSED_VALUE);
	
	private int value;
	
	private CategoryStatus(int value)
	{
		this.value = value;
	}
	
	public String toString()
	{
		switch(this.value)
		{
			case ACTIVE_VALUE:
				return "Active";
			case PAUSED_VALUE:
				return "Paused";
		}
		return null;
	}
}
