/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

import java.rmi.RemoteException;

public interface IMIBPContract
{
	/**
	 * Activates a Category that has been paused with the {@link #pauseCategory(UserCredential, String)} method. A Category that has been paused is not available until it has been activated.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param categoryName The name of the category to be activated.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean activateCategory(UserCredential userCredential, String categoryName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault;
	
	/**
	 * Activates a Tag that has been paused with the {@link #pauseTag(UserCredential, String, String)} method. A Tag that has been paused is not available until it has been activated.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param categoryName The name of the Category containing the Tag to be activated.
	 * @param tagName The name of the Tag to be activated.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean activateTag(UserCredential userCredential, String categoryName, String tagName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault;
	
	/**
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param category A {@link Category} object representing the category to be created.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean createCategory(UserCredential userCredential, Category category) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault;
	
	/**
	 * Creates a new Tag within a specified Category.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param categoryName The name of the category that will contain the new Tag.
	 * @param tag The Tag object containing the information for the new Tag.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean createTag(UserCredential userCredential, String categoryName, Tag tag) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault;
	
	public boolean deleteTag(UserCredential userCredential, String categoryName, String tagName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault;
	
	/**
	 * Renders the Tag into a byte array representing an image.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param categoryName The name of the Category containing the Tag to be rendered.
	 * @param tagName The name of the Tag to be rendered.
	 * @param imageType Image render Type: Includes pdf, wmf, jpeg, png, gif, and tif.
	 * @param sizeInInches Barcode Size (in inches): Ranging from 0.75 to 120.0.
	 * @param decorationsType Choose one of four Color Formats.
	 * @param isBlackWhite Choose just the black and white format.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public byte[] getBarcode(UserCredential userCredential, String categoryName, String tagName, ImageType imageType, float sizeInInches, DecorationType decorationsType, boolean isBlackWhite) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault;
	
	/**
	 * Return the Tag Id to the users.
	 */
	public String getTagId(UserCredential userCredential, String categoryName, String tagName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault;
	
	/**
	 * Places a specified Category and all of the Tags it contains in a paused state, making them unavailable.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param categoryName The name of the category to be paused.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean pauseCategory(UserCredential userCredential, String categoryName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault;
	
	/**
	 * Places a specified Tag in a paused state, making it unavailable.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param categoryName The name of the category containing the Tag to be paused.
	 * @param tagName The name of the Tag to be paused.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean pauseTag(UserCredential userCredential, String categoryName, String tagName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault;
	
	/**
	 * Allows you to update the properties of a Category.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param existingCategoryName The current category name.
	 * @param category A Category object containing the new category information.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean updateCategory(UserCredential userCredential, String existingCategoryName, Category category) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault;
	
	/**
	 * Allows you to change Tag information, such as the Tag Title, Tag Type, Start Date and End Date.
	 * @param userCredential A 64-bit encrypted GUID specifying the user credential.
	 * @param categoryName The name of the Category containing the Tag to be updated.
	 * @param existingTagName The current name of the Tag to be updated.
	 * @param tag The new Tag object containing the information that will update the Tag.
	 * @return <code>true</code> if the method succeeds. <code>false</code> if the method fails.
	 */
	public boolean updateTag(UserCredential userCredential, String categoryName, String existingTagName, Tag tag) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault;
}
