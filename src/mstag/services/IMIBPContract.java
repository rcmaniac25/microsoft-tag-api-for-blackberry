// This class was generated by 172 StubGenerator.
// Contents subject to change without notice.
// @generated

package mstag.services;

public interface IMIBPContract extends java.rmi.Remote {
	public java.lang.Boolean createCategory(mstag.services.UserCredential userCredential, mstag.services.Category category) throws java.rmi.RemoteException, mstag.services.CategoryFault, mstag.services.SenderFault, mstag.services.UserAuthFault, mstag.services.ReceiverFault;

	public java.lang.Boolean updateCategory(mstag.services.UserCredential userCredential, java.lang.String existingCategoryName, mstag.services.Category category) throws java.rmi.RemoteException, mstag.services.UserAuthFault, mstag.services.SenderFault, mstag.services.CategoryFault, mstag.services.ReceiverFault;

	public java.lang.Boolean activateCategory(mstag.services.UserCredential userCredential, java.lang.String categoryName) throws java.rmi.RemoteException, mstag.services.ReceiverFault, mstag.services.SenderFault, mstag.services.UserAuthFault, mstag.services.CategoryFault;

	public java.lang.Boolean pauseCategory(mstag.services.UserCredential userCredential, java.lang.String categoryName) throws java.rmi.RemoteException, mstag.services.CategoryFault, mstag.services.SenderFault, mstag.services.UserAuthFault, mstag.services.ReceiverFault;

	public java.lang.Boolean createTag(mstag.services.UserCredential userCredential, java.lang.String categoryName, mstag.services.Tag tag) throws java.rmi.RemoteException, mstag.services.SenderFault, mstag.services.TagFault, mstag.services.CategoryFault, mstag.services.UserAuthFault, mstag.services.ReceiverFault;

	public java.lang.Boolean activateTag(mstag.services.UserCredential userCredential, java.lang.String categoryName, java.lang.String tagName) throws java.rmi.RemoteException, mstag.services.SenderFault, mstag.services.TagFault, mstag.services.UserAuthFault, mstag.services.ReceiverFault, mstag.services.CategoryFault;

	public java.lang.Boolean pauseTag(mstag.services.UserCredential userCredential, java.lang.String categoryName, java.lang.String tagName) throws java.rmi.RemoteException, mstag.services.CategoryFault, mstag.services.ReceiverFault, mstag.services.SenderFault, mstag.services.TagFault, mstag.services.UserAuthFault;

	public java.lang.Boolean deleteTag(mstag.services.UserCredential userCredential, java.lang.String categoryName, java.lang.String tagName) throws java.rmi.RemoteException, mstag.services.UserAuthFault, mstag.services.CategoryFault, mstag.services.SenderFault, mstag.services.ReceiverFault, mstag.services.TagFault;

	public java.lang.Boolean updateTag(mstag.services.UserCredential userCredential, java.lang.String categoryName, java.lang.String existingTagName, mstag.services.Tag tag) throws java.rmi.RemoteException, mstag.services.SenderFault, mstag.services.CategoryFault, mstag.services.ReceiverFault, mstag.services.TagFault, mstag.services.UserAuthFault;

	public byte[] getBarcode(mstag.services.UserCredential userCredential, java.lang.String categoryName, java.lang.String tagName, java.lang.String[] imageType, java.lang.Float sizeInInches, mstag.services.DecorationType decorationsType, java.lang.Boolean isBlackWhite) throws java.rmi.RemoteException, mstag.services.TagFault, mstag.services.ReceiverFault, mstag.services.SenderFault, mstag.services.BarCodeFault, mstag.services.CategoryFault, mstag.services.UserAuthFault;

	public java.lang.String getTagId(mstag.services.UserCredential userCredential, java.lang.String categoryName, java.lang.String tagName) throws java.rmi.RemoteException, mstag.services.SenderFault, mstag.services.UserAuthFault, mstag.services.CategoryFault, mstag.services.ReceiverFault, mstag.services.TagFault;

}
