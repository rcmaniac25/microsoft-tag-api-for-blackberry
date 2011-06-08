/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public interface IMIBPContract
{
	public static final int IMG_TYPE_PDF = 1;
	public static final int IMG_TYPE_WMF = IMG_TYPE_PDF + 1;
	public static final int IMG_TYPE_JPEG = IMG_TYPE_WMF + 1;
	public static final int IMG_TYPE_PNG = IMG_TYPE_JPEG + 1;
	public static final int IMG_TYPE_GIF = IMG_TYPE_PNG + 1;
	public static final int IMG_TYPE_TIFF = IMG_TYPE_GIF + 1;
	public static final int IMG_TYPE_TAG = IMG_TYPE_TIFF + 1;
	
	public static final int DECORATION_TYPE_HCCBRP_DECORATION_NONE = 0;
	public static final int DECORATION_TYPE_HCCBRP_DECORATION_DOWNLOAD = 3;
	public static final int DECORATION_TYPE_HCCBENCODEFLAG_STYLIZED = 0x13;
	public static final int DECORATION_TYPE_HCCBRP_DECORATION_FRAMEPLAIN = 8;
	public static final int DECORATION_TYPE_HCCBRP_DECORATION_TEXT = 0x20;
	
	/**
	 * Activates a Category that has been paused with the {@link #PauseCategory(UserCredential, String)} method. A Category that has been paused is not available until it has been activated.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param categoryName The name of the category to be activated.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean ActivateCategory(UserCredential userCredential, String categoryName);
	
	/**
	 * Activates a Tag that has been paused with the {@link #PauseTag(UserCredential, String, String)} method. A Tag that has been paused is not available until it has been activated.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param categoryName The name of the Category containing the Tag to be activated.
	 * @param tagName The name of the Tag to be activated.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean ActivateTag(UserCredential userCredential, String categoryName, String tagName);
	
	/**
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param category A {@link Category} object representing the category to be created.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean CreateCategory(UserCredential userCredential, Category category);
	
	/**
	 * Creates a new Tag within a specified Category.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param categoryName The name of the category that will contain the new Tag.
	 * @param tag The Tag object containing the information for the new Tag.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean CreateTag(UserCredential userCredential, String categoryName, Tag tag);
	
	public boolean DeleteTag(UserCredential userCredential, String categoryName, String tagName);
	
	/**
	 * Renders the Tag into a byte array representing an image.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param categoryName The name of the Category containing the Tag to be rendered.
	 * @param tagName The name of the Tag to be rendered.
	 * @param imageType Image render Type: Includes pdf, wmf, jpeg, png, gif, and tif. (One of the <code>IMG_TYPE_*</code> constants)
	 * @param sizeInInches Barcode Size (in inches): Ranging from 0.75 to 120.0.
	 * @param decorationsType Choose one of four Color Formats. (One of the <code>DECORATION_TYPE_*</code> constants)
	 * @param isBlackWhite Choose just the black and white format.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public byte[] GetBarcode(UserCredential userCredential, String categoryName, String tagName, int imageType, float sizeInInches, int decorationsType, boolean isBlackWhite);
	
	/**
	 * Return the Tag Id to the users.
	 */
	public String GetTagId(UserCredential userCredential, String categoryName, String tagName);
	
	/**
	 * Places a specified Category and all of the Tags it contains in a paused state, making them unavailable.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param categoryName The name of the category to be paused.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean PauseCategory(UserCredential userCredential, String categoryName);
	
	/**
	 * Places a specified Tag in a paused state, making it unavailable.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param categoryName The name of the category containing the Tag to be paused.
	 * @param tagName The name of the Tag to be paused.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean PauseTag(UserCredential userCredential, String categoryName, String tagName);
	
	/**
	 * Allows you to update the properties of a Category.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param existingCategoryName The current category name.
	 * @param category A Category object containing the new category information.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean UpdateCategory(UserCredential userCredential, String existingCategoryName, Category category);
	
	/**
	 * Allows you to change Tag information, such as the Tag Title, Tag Type, Start Date and End Date.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param categoryName The name of the Category containing the Tag to be updated.
	 * @param existingTagName The current name of the Tag to be updated.
	 * @param tag The new Tag object containing the information that will update the Tag.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean UpdateTag(UserCredential userCredential, String categoryName, String existingTagName, Tag tag);
}
