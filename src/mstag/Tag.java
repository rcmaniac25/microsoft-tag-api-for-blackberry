/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

import java.util.Calendar;

/**
 * Base class for all Tag types.
 */
public abstract class Tag
{
	public static final int TAG_STATUS_ACTIVE = 0;
	public static final int TAG_STATUS_PAUSED = TAG_STATUS_ACTIVE + 1;
	public static final int TAG_STATUS_DELETE = TAG_STATUS_PAUSED + 1;
	
	private String apay, note, title;
	private Calendar end, start;
	int status, type;
	
	/**
	 * Initializes a new instance of the Tag class
	 */
	protected Tag()
	{
	}
	
	/**
	 * Gets the associated payload.
	 * @return Associated payload.
	 */
	public String getAssociatedPayload()
	{
		return this.apay;
	}
	
	/**
	 * Sets the associated payload.
	 * @param payload Associated payload.
	 */
	public void setAssociatedPayload(String payload)
	{
		this.apay = payload;
	}
	
	/**
	 * Gets an interaction note.
	 * @return Interaction note.
	 */
	public String getInteractionNote()
	{
		return this.note;
	}
	
	/**
	 * Sets an interaction note.
	 * @param note Interaction note.
	 */
	public void setInteractionNote(String note)
	{
		this.note = note;
	}
	
	/**
	 * Get the Tag title (name).
	 * @return Tag title.
	 */
	public String getTitle()
	{
		return this.title;
	}
	
	/**
	 * Set the Tag title (name).
	 * @param title Tag title.
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	/**
	 * Gets the Tag end date.
	 * @return The expire date and time.
	 */
	public Calendar getUTCEndDate()
	{
		return this.end;
	}
	
	/**
	 * Sets the Tag end date.
	 * @param expire The expire date and time.
	 */
	public void setUTCEndDate(Calendar expire)
	{
		this.end = expire;
	}
	
	/**
	 * Gets the Tag start date.
	 * @return The start date and time.
	 */
	public Calendar getUTCStartDate()
	{
		return this.start;
	}
	
	/**
	 * Sets the Tag start date.
	 * @param expire The start date and time.
	 */
	public void setUTCStartDate(Calendar start)
	{
		this.start = start;
	}
	
	/**
	 * Gets the Tag status.
	 * @return Tag status. (One of the <code>TAG_STATUS_*</code> constants)
	 */
	public int getStatus()
	{
		return this.status;
	}
	
	/**
	 * Gets the Tag image type.
	 * @return Tag image type. (One of the <code>IMIBPContract.IMG_TYPE_*</code> constants)
	 */
	public int getTypes()
	{
		return this.type;
	}
}
