/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

import java.util.Calendar;

/**
 * Represents a Category container of Tags.
 */
public class Category
{
	protected String name;
	protected CategoryStatus status;
	protected Calendar end, start;
	
	/**
	 * Initializes a new instance of the Category class
	 */
	public Category()
	{
		this.status = CategoryStatus.ACTIVE;
		this.start = Calendar.getInstance();
	}
	
	/**
	 * Initializes a new instance of the Category class
	 * @param name Category name.
	 */
	public Category(String name)
	{
		this();
		this.name = name;
	}
	
	/**
	 * Get the name of the Category.
	 * @return The name of the Category.
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Set the name of the Category.
	 * @param name The name of the Category.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Gets the availability status of the Category.
	 * @return Category status.
	 */
	public CategoryStatus getStatus()
	{
		return this.status;
	}
	
	/**
	 * Sets the availability status of the Category.
	 * @param status Category status.
	 */
	public void setStatus(CategoryStatus status)
	{
		this.status = status;
	}
	
	/**
	 * Gets the date and time the Category expires.
	 * @return The expire date and time.
	 */
	public Calendar getUTCEndDate()
	{
		return this.end;
	}
	
	/**
	 * Sets the date and time the Category expires.
	 * @param expire The expire date and time.
	 */
	public void setUTCEndDate(Calendar expire)
	{
		this.end = expire;
	}
	
	/**
	 * Gets the date and time the Category becomes active.
	 * @return The start date and time.
	 */
	public Calendar getUTCStartDate()
	{
		return this.start;
	}
	
	/**
	 * Sets the date and time the Category becomes active.
	 * @param expire The start date and time.
	 */
	public void setUTCStartDate(Calendar start)
	{
		this.start = start;
	}
}
