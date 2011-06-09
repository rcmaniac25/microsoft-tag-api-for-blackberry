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
	protected String apay, note, title;
	protected Calendar end, start;
	protected ImageType type;
	protected TagStatus status;
	
	/**
	 * Initializes a new instance of the Tag class
	 */
	protected Tag()
	{
		this.status = TagStatus.ACTIVE;
		this.start = Calendar.getInstance();
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
	 * @return Tag status.
	 */
	public TagStatus getStatus()
	{
		return this.status;
	}
	
	/**
	 * Sets the Tag status.
	 * @param status Tag status.
	 */
	public void setStatus(TagStatus status)
	{
		this.status = status;
	}
	
	/**
	 * Gets the Tag image type.
	 * @return Tag image type.
	 */
	public ImageType getTypes()
	{
		return this.type;
	}
	
	/**
	 * Sets the Tag image type.
	 * @param type Tag image type.
	 */
	public void setTypes(ImageType type)
	{
		this.type = type;
	}
}
