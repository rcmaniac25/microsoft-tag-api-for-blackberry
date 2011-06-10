/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

import javax.microedition.xml.rpc.ComplexType;
import javax.microedition.xml.rpc.Element;
import javax.microedition.xml.rpc.FaultDetailException;
import javax.microedition.xml.rpc.FaultDetailHandler;
import javax.microedition.xml.rpc.Operation;
import javax.microedition.xml.rpc.Type;

import javax.xml.namespace.QName;

import javax.xml.rpc.JAXRPCException;
import javax.xml.rpc.Stub;

import net.rim.device.api.io.Base64InputStream;

import java.io.IOException;
import java.rmi.RemoteException;

public final class MIBPClient implements IMIBPContract, Stub, FaultDetailHandler
{
	private static final net.rim.device.api.i18n.ResourceBundle _resources = net.rim.device.api.i18n.ResourceBundle.getBundle(TagResource.BUNDLE_ID, TagResource.BUNDLE_NAME);
	
	//Qualified names
	//-Faults
	protected static String EMPTY_STR = "";
	protected static final QName _qname_BarCodeFaultFault = new QName(EMPTY_STR, "BarCodeFaultFault");
	protected static final QName _qname_CategoryFaultFault = new QName(EMPTY_STR, "CategoryFaultFault");
	protected static final QName _qname_ReceiverFaultFault = new QName(EMPTY_STR, "ReceiverFaultFault");
	protected static final QName _qname_SenderFaultFault = new QName(EMPTY_STR, "SenderFaultFault");
	protected static final QName _qname_TagFaultFault = new QName(EMPTY_STR, "TagFaultFault");
	protected static final QName _qname_UserAuthFaultFault = new QName(EMPTY_STR, "UserAuthFaultFault");
	
	//-Functions
	protected static String NAMESPACE_TEMPURI = "http://tempuri.org/";
	protected static final QName _qname__ActivateCategory = new QName(NAMESPACE_TEMPURI, "ActivateCategory");
	protected static final QName _qname__ActivateTag = new QName(NAMESPACE_TEMPURI, "ActivateTag");
	protected static final QName _qname__CreateCategory = new QName(NAMESPACE_TEMPURI, "CreateCategory");
	protected static final QName _qname__CreateTag = new QName(NAMESPACE_TEMPURI, "CreateTag");
	protected static final QName _qname__DeleteTag = new QName(NAMESPACE_TEMPURI, "DeleteTag");
	protected static final QName _qname__GetBarcode = new QName(NAMESPACE_TEMPURI, "GetBarcode");
	protected static final QName _qname__GetTagId = new QName(NAMESPACE_TEMPURI, "GetTagId");
	protected static final QName _qname__PauseCategory = new QName(NAMESPACE_TEMPURI, "PauseCategory");
	protected static final QName _qname__PauseTag = new QName(NAMESPACE_TEMPURI, "PauseTag");
	protected static final QName _qname__UpdateCategory = new QName(NAMESPACE_TEMPURI, "UpdateCategory");
	protected static final QName _qname__UpdateTag = new QName(NAMESPACE_TEMPURI, "UpdateTag");
	
	//-Fields
	protected static String NAMESPACE_MSTAG_VER1 = "http://www.ws.tag.microsoft.com/ver1";
	protected static final QName _qname_ErrorMessage = new QName(NAMESPACE_MSTAG_VER1, "ErrorMessage");
	protected static final QName _qname_Reason = new QName(NAMESPACE_MSTAG_VER1, "Reason");
	protected static final QName _qname_AccessToken = new QName(NAMESPACE_MSTAG_VER1, "AccessToken");
	protected static final QName _qname_UTCEndDate = new QName(NAMESPACE_MSTAG_VER1, "UTCEndDate");
	protected static final QName _qname_UTCStartDate = new QName(NAMESPACE_MSTAG_VER1, "UTCStartDate");
	protected static final QName _qname_Name = new QName(NAMESPACE_MSTAG_VER1, "Name");
	protected static final QName _qname_CategoryStatus = new QName(NAMESPACE_MSTAG_VER1, "CategoryStatus");
	protected static final QName _qname_Title = new QName(NAMESPACE_MSTAG_VER1, "Title");
	protected static final QName _qname_InteractionNote = new QName(NAMESPACE_MSTAG_VER1, "InteractionNote");
	protected static final QName _qname_Status = new QName(NAMESPACE_MSTAG_VER1, "Status");
	protected static final QName _qname_Types = new QName(NAMESPACE_MSTAG_VER1, "Types");
	protected static final QName _qname_AssociatedPayload = new QName(NAMESPACE_MSTAG_VER1, "AssociatedPayload");
	
	//-Parameters
	protected static final QName _qname_categoryName = new QName(NAMESPACE_MSTAG_VER1, "categoryName");
	protected static final QName _qname_userCredential = new QName(NAMESPACE_MSTAG_VER1, "userCredential");
	protected static final QName _qname_category = new QName(NAMESPACE_MSTAG_VER1, "category");
	protected static final QName _qname_tagName = new QName(NAMESPACE_MSTAG_VER1, "tagName");
	protected static final QName _qname_tag = new QName(NAMESPACE_MSTAG_VER1, "tag");
	protected static final QName _qname_imageType = new QName(NAMESPACE_MSTAG_VER1, "imageType");
	protected static final QName _qname_sizeInInches = new QName(NAMESPACE_MSTAG_VER1, "sizeInInches");
	protected static final QName _qname_decorationsType = new QName(NAMESPACE_MSTAG_VER1, "decorationsType");
	protected static final QName _qname_isBlackWhite = new QName(NAMESPACE_MSTAG_VER1, "isBlackWhite");
	protected static final QName _qname_existingTagName = new QName(NAMESPACE_MSTAG_VER1, "existingTagName");
	protected static final QName _qname_existingCategoryName = new QName(NAMESPACE_MSTAG_VER1, "existingCategoryName");
	
	//-Function Parameters
	protected static final QName _qname_ActivateCategory = new QName(NAMESPACE_MSTAG_VER1, "ActivateCategory");
	protected static final QName _qname_CreateCategory = new QName(NAMESPACE_MSTAG_VER1, "CreateCategory");
	protected static final QName _qname_ActivateTag = new QName(NAMESPACE_MSTAG_VER1, "ActivateTag");
	protected static final QName _qname_CreateTag = new QName(NAMESPACE_MSTAG_VER1, "CreateTag");
	protected static final QName _qname_DeleteTag = new QName(NAMESPACE_MSTAG_VER1, "DeleteTag");
	protected static final QName _qname_GetBarcode = new QName(NAMESPACE_MSTAG_VER1, "GetBarcode");
	protected static final QName _qname_GetTagId = new QName(NAMESPACE_MSTAG_VER1, "GetTagId");
	protected static final QName _qname_UpdateCategory = new QName(NAMESPACE_MSTAG_VER1, "UpdateCategory");
	protected static final QName _qname_PauseTag = new QName(NAMESPACE_MSTAG_VER1, "PauseTag");
	protected static final QName _qname_PauseCategory = new QName(NAMESPACE_MSTAG_VER1, "PauseCategory");
	
	//-Function Responses
	protected static final QName _qname_ActivateCategoryResponse = new QName(NAMESPACE_MSTAG_VER1, "ActivateCategoryResponse");
	protected static final QName _qname_CreateCategoryResponse = new QName(NAMESPACE_MSTAG_VER1, "CreateCategoryResponse");
	protected static final QName _qname_ActivateTagResponse = new QName(NAMESPACE_MSTAG_VER1, "ActivateTagResponse");
	protected static final QName _qname_CreateTagResponse = new QName(NAMESPACE_MSTAG_VER1, "CreateTagResponse");
	protected static final QName _qname_DeleteTagResponse = new QName(NAMESPACE_MSTAG_VER1, "DeleteTagResponse");
	protected static final QName _qname_GetBarcodeResponse = new QName(NAMESPACE_MSTAG_VER1, "GetBarcodeResponse");
	protected static final QName _qname_GetTagIdResponse = new QName(NAMESPACE_MSTAG_VER1, "GetTagIdResponse");
	protected static final QName _qname_UpdateTagResponse = new QName(NAMESPACE_MSTAG_VER1, "UpdateTagResponse");
	protected static final QName _qname_UpdateCategoryResponse = new QName(NAMESPACE_MSTAG_VER1, "UpdateCategoryResponse");
	protected static final QName _qname_PauseTagResponse = new QName(NAMESPACE_MSTAG_VER1, "PauseTagResponse");
	protected static final QName _qname_PauseCategoryResponse = new QName(NAMESPACE_MSTAG_VER1, "PauseCategoryResponse");
	
	//-Function Results
	protected static final QName _qname_ActivateCategoryResult = new QName(NAMESPACE_MSTAG_VER1, "ActivateCategoryResult");
	protected static final QName _qname_CreateCategoryResult = new QName(NAMESPACE_MSTAG_VER1, "CreateCategoryResult");
	protected static final QName _qname_ActivateTagResult = new QName(NAMESPACE_MSTAG_VER1, "ActivateTagResult");
	protected static final QName _qname_CreateTagResult = new QName(NAMESPACE_MSTAG_VER1, "CreateTagResult");
	protected static final QName _qname_DeleteTagResult = new QName(NAMESPACE_MSTAG_VER1, "DeleteTagResult");
	protected static final QName _qname_GetBarcodeResult = new QName(NAMESPACE_MSTAG_VER1, "GetBarcodeResult");
	protected static final QName _qname_GetTagIdResult = new QName(NAMESPACE_MSTAG_VER1, "GetTagIdResult");
	protected static final QName _qname_UpdateTagResult = new QName(NAMESPACE_MSTAG_VER1, "UpdateTagResult");
	protected static final QName _qname_UpdateTag = new QName(NAMESPACE_MSTAG_VER1, "UpdateTag");
	protected static final QName _qname_UpdateCategoryResult = new QName(NAMESPACE_MSTAG_VER1, "UpdateCategoryResult");
	protected static final QName _qname_PauseTagResult = new QName(NAMESPACE_MSTAG_VER1, "PauseTagResult");
	protected static final QName _qname_PauseCategoryResult = new QName(NAMESPACE_MSTAG_VER1, "PauseCategoryResult");
	
	//Types
	protected static final Element _type_ReceiverFaultFault;
	protected static final Element _type_UserAuthFaultFault;
	protected static final Element _type_CategoryFaultFault;
	protected static final Element _type_SenderFaultFault;
	protected static final Element _type_TagFaultFault;
	protected static final Element _type_BarCodeFaultFault;
	
	//Function parameters
	protected static final Element _type_ActivateCategory;
	protected static final Element _type_CreateCategory;
	protected static final Element _type_ActivateTag;
	protected static final Element _type_CreateTag;
	protected static final Element _type_DeleteTag;
	protected static final Element _type_GetBarcode;
	protected static final Element _type_GetTagId;
	protected static final Element _type_UpdateTag;
	protected static final Element _type_UpdateCategory;
	protected static final Element _type_PauseTag;
	protected static final Element _type_PauseCategory;
	
	//Function responses
	protected static final Element _type_ActivateCategoryResponse;
	protected static final Element _type_CreateCategoryResponse;
	protected static final Element _type_ActivateTagResponse;
	protected static final Element _type_CreateTagResponse;
	protected static final Element _type_DeleteTagResponse;
	protected static final Element _type_GetBarcodeResponse;
	protected static final Element _type_GetTagIdResponse;
	protected static final Element _type_UpdateTagResponse;
	protected static final Element _type_UpdateCategoryResponse;
	protected static final Element _type_PauseTagResponse;
	protected static final Element _type_PauseCategoryResponse;
	
	static
	{
		//Exceptions/Faults
		ComplexType compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_ErrorMessage, Type.STRING, 1, 1, true), new Element(_qname_Reason, Type.STRING)};
		_type_ReceiverFaultFault = new Element(_qname_ReceiverFaultFault, compType);
		_type_UserAuthFaultFault = new Element(_qname_UserAuthFaultFault, compType);
		_type_CategoryFaultFault = new Element(_qname_CategoryFaultFault, compType);
		_type_SenderFaultFault = new Element(_qname_SenderFaultFault, compType);
		_type_TagFaultFault = new Element(_qname_TagFaultFault, compType);
		_type_BarCodeFaultFault = new Element(_qname_BarCodeFaultFault, compType);
		
		//Function parameters
		compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_AccessToken, Type.STRING, 1, 1, true)};
		Element _type_userCredential = new Element(_qname_userCredential, compType, 0, 1, true);
		Element _type_categoryName = new Element(_qname_categoryName, Type.STRING, 0, 1, true);
		Element _type_tagName = new Element(_qname_tagName, Type.STRING, 0, 1, true);
		Element _type_UTCStartDate = new Element(_qname_UTCStartDate, Type.STRING);
		Element _type_UTCEndDate = new Element(_qname_UTCEndDate, Type.STRING, 0, 1, true);
		compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_Title, Type.STRING, 1, 1, true),
				new Element(_qname_InteractionNote, Type.STRING, 1, 1, true),
				new Element(_qname_Status, Type.STRING),
				new Element(_qname_Types, Type.STRING, 1, -1, false),
				_type_UTCStartDate,_type_UTCEndDate,
				new Element(_qname_AssociatedPayload, Type.STRING, 0, 1, true)
		};
		Element _type_tag = new Element(_qname_tag, compType, 0, 1, true);
		
		compType = new ComplexType();
		compType.elements = new Element[]{_type_userCredential, _type_categoryName};
		_type_ActivateCategory = new Element(_qname_ActivateCategory, compType);
		_type_PauseCategory = new Element(_qname_PauseCategory, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_Name, Type.STRING, 1, 1, true), _type_UTCStartDate, _type_UTCEndDate, 
				new Element(_qname_CategoryStatus, Type.STRING, 0, 1, false)};
		Element _type_category = new Element(_qname_category, compType, 0, 1, true);
		
		compType = new ComplexType();
		compType.elements = new Element[]{_type_userCredential, _type_category};
		_type_CreateCategory = new Element(_qname_CreateCategory, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{_type_userCredential, _type_categoryName, _type_tagName};
		_type_ActivateTag = new Element(_qname_ActivateTag, compType);
		_type_PauseTag = new Element(_qname_PauseTag, compType);
		_type_GetTagId = new Element(_qname_GetTagId, compType);
		_type_DeleteTag = new Element(_qname_DeleteTag, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{_type_userCredential, _type_categoryName, _type_tag};
		_type_CreateTag = new Element(_qname_CreateTag, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{_type_userCredential, _type_categoryName, _type_tagName, new Element(_qname_imageType, Type.STRING, 0, -1, false),
				new Element(_qname_sizeInInches, Type.FLOAT, 0, 1, false), new Element(_qname_decorationsType, Type.STRING, 0, 1, false),
				new Element(_qname_isBlackWhite, Type.BOOLEAN, 0, 1, false)
		};
		_type_GetBarcode = new Element(_qname_GetBarcode, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{_type_userCredential, _type_categoryName, 
				new Element(_qname_existingTagName, Type.STRING, 0, 1, true), _type_tag};
		_type_UpdateTag = new Element(_qname_UpdateTag, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{_type_userCredential, new Element(_qname_existingCategoryName, Type.STRING, 0, 1, true), _type_category};
		_type_UpdateCategory = new Element(_qname_UpdateCategory, compType);
		
		//Function responses
		compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_ActivateCategoryResult, Type.BOOLEAN, 0, 1, false)};
		_type_ActivateCategoryResponse = new Element(_qname_ActivateCategoryResponse, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_CreateCategoryResult, Type.BOOLEAN, 0, 1, false)};
		_type_CreateCategoryResponse = new Element(_qname_CreateCategoryResponse, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_ActivateTagResult, Type.BOOLEAN, 0, 1, false)};
		_type_ActivateTagResponse = new Element(_qname_ActivateTagResponse, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_CreateTagResult, Type.BOOLEAN, 0, 1, false)};
		_type_CreateTagResponse = new Element(_qname_CreateTagResponse, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_DeleteTagResult, Type.BOOLEAN, 0, 1, false)};
		_type_DeleteTagResponse = new Element(_qname_DeleteTagResponse, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_GetBarcodeResult, Type.STRING, 0, 1, true)};
		_type_GetBarcodeResponse = new Element(_qname_GetBarcodeResponse, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_GetTagIdResult, Type.STRING, 0, 1, true)};
		_type_GetTagIdResponse = new Element(_qname_GetTagIdResponse, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_UpdateTagResult, Type.BOOLEAN, 0, 1, false)};
		_type_UpdateTagResponse = new Element(_qname_UpdateTagResponse, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_UpdateCategoryResult, Type.BOOLEAN, 0, 1, false)};
		_type_UpdateCategoryResponse = new Element(_qname_UpdateCategoryResponse, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_PauseTagResult, Type.BOOLEAN, 0, 1, false)};
		_type_PauseTagResponse = new Element(_qname_PauseTagResponse, compType);
		
		compType = new ComplexType();
		compType.elements = new Element[]{new Element(_qname_PauseCategoryResult, Type.BOOLEAN, 0, 1, false)};
		_type_PauseCategoryResponse = new Element(_qname_PauseCategoryResponse, compType);
	}
	
	//Variables
	private UserCredential cred;
	private String[] _propertyNames;
	private Object[] _propertyValues;
	
	public MIBPClient()
	{
		_propertyNames = new String[] {ENDPOINT_ADDRESS_PROPERTY};
		_propertyValues = new Object[] {"https://ws.tag.microsoft.com/Service.svc"};
	}
	
	public MIBPClient(String token)
	{
		this();
		if(token != null)
		{
			cred = new UserCredential(token);
		}
	}
	
	public Element handleFault(QName name)
	{
		String local = name.getLocalPart();
		String URI = name.getNamespaceURI();
		if ("BarCodeFault".equals(local) && NAMESPACE_MSTAG_VER1.equals(URI))
		{
			return _type_BarCodeFaultFault;
		}
		if ("CategoryFault".equals(local) && NAMESPACE_MSTAG_VER1.equals(URI))
		{
			return _type_CategoryFaultFault;
		}
		if ("ReceiverFault".equals(local) && NAMESPACE_MSTAG_VER1.equals(URI))
		{
			return _type_ReceiverFaultFault;
		}
		if ("SenderFault".equals(local) && NAMESPACE_MSTAG_VER1.equals(URI))
		{
			return _type_SenderFaultFault;
		}
		if ("TagFault".equals(local) && NAMESPACE_MSTAG_VER1.equals(URI))
		{
			return _type_TagFaultFault;
		}
		if ("UserAuthFault".equals(local) && NAMESPACE_MSTAG_VER1.equals(URI))
		{
			return _type_UserAuthFaultFault;
		}
		return null;
	}
	
	public Object _getProperty(String name)
	{
		for (int i = _propertyNames.length - 1; i >= 0; i--)
		{
			if (_propertyNames[i].equals(name))
			{
				return _propertyValues[i];
			}
		}
		if (ENDPOINT_ADDRESS_PROPERTY.equals(name) || USERNAME_PROPERTY.equals(name) || PASSWORD_PROPERTY.equals(name))
		{
			return null;
		}
		if (SESSION_MAINTAIN_PROPERTY.equals(name))
		{
			return new java.lang.Boolean(false);
		}
		throw new JAXRPCException(MIBPClient._resources.getString(TagResource.MIBP_CLIENT_UNK_PROPERTY)+name);
	}
	
	public void _setProperty(String name, Object value)
	{
		int size = _propertyNames.length;
		for (int i = 0; i < size; ++i)
		{
			if (_propertyNames[i].equals(name))
			{
				_propertyValues[i] = value;
				return;
			}
		}
		// Need to expand our array for a new property
		String[] newPropNames = new String[size + 1];
		System.arraycopy(_propertyNames, 0, newPropNames, 0, size);
		_propertyNames = newPropNames;
		Object[] newPropValues = new Object[size + 1];
		System.arraycopy(_propertyValues, 0, newPropValues, 0, size);
		_propertyValues = newPropValues;
		
		_propertyNames[size] = name;
		_propertyValues[size] = value;
	}
	
	protected void _prepOperation(Operation op)
	{
		for (int i = _propertyNames.length - 1; i >= 0; i--)
		{
			op.setProperty(_propertyNames[i], _propertyValues[i].toString());
		}
	}
	
	private Object invokeMethod(UserCredential userCredential, Object[] additionParameters, QName qname, Element input, Element output, String functionName) 
		throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		// Copy the incoming values into an Object array if needed.
		Object[] inputObject = new Object[additionParameters.length + 1];
		if (userCredential == null)
		{
			inputObject[0] = null;
		}
		else
		{
			inputObject[0] = new Object[]{userCredential.token};
		}
		System.arraycopy(additionParameters, 0, inputObject, 1, additionParameters.length);
		//Prepare Operation and execute
		Operation op = Operation.newInstance(qname, input, output, this);
		_prepOperation(op);
		op.setProperty(Operation.SOAPACTION_URI_PROPERTY, "http://www.ws.tag.microsoft.com/ver1/IMIBPContract/" + functionName);
		Object resultObj;
		try
		{
			resultObj = op.invoke(inputObject);
		}
		catch (JAXRPCException e)
		{
			//Handle exceptions
			Throwable cause = e.getLinkedCause();
			if (cause instanceof RemoteException)
			{
				throw (RemoteException)cause;
			}
			else if (cause instanceof FaultDetailException)
			{
				FaultDetailException fde = (FaultDetailException)cause;
				
				QName fdeName = fde.getFaultDetailName();
				
				String fdeNameLocal = fdeName.getLocalPart();
				String fdeNameURI = fdeName.getNamespaceURI();
				
				Object[] detail = (Object[])fde.getFaultDetail();
				
				String errorMsg = (String)detail[0];
				String reasonStr = (String)detail[1];
				
				if ("ReceiverFaultFault".equals(fdeNameLocal) && NAMESPACE_MSTAG_VER1.equals(fdeNameURI))
				{
					throw new ReceiverFault(errorMsg, ReceiverFaultReason.fromValue(reasonStr));
				}
				if ("UserAuthFaultFault".equals(fdeNameLocal) && NAMESPACE_MSTAG_VER1.equals(fdeNameURI))
				{
					throw new UserAuthFault(errorMsg, UserAuthFaultReason.fromValue(reasonStr));
				}
				if ("CategoryFaultFault".equals(fdeNameLocal) && NAMESPACE_MSTAG_VER1.equals(fdeNameURI))
				{
					throw new CategoryFault(errorMsg, CategoryFaultReason.fromValue(reasonStr));
				}
				if ("TagFaultFault".equals(fdeNameLocal) && NAMESPACE_MSTAG_VER1.equals(fdeNameURI))
				{
					throw new TagFault(errorMsg, TagFaultReason.fromValue(reasonStr));
				}
				if ("SenderFaultFault".equals(fdeNameLocal) && NAMESPACE_MSTAG_VER1.equals(fdeNameURI))
				{
					throw new SenderFault(errorMsg, SenderFaultReason.fromValue(reasonStr));
				}
			}
			throw e;
		}
		return resultObj;
	}
	
	//Function code
	
	public boolean activateCategory(String categoryName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return activateCategory(this.cred, categoryName);
	}
	
	public boolean activateCategory(UserCredential userCredential, String categoryName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return ((Boolean)((Object[])invokeMethod(userCredential, new Object[]{categoryName}, _qname__ActivateCategory, _type_ActivateCategory, _type_ActivateCategoryResponse, "ActivateCategory"))[0]).booleanValue();
	}
	
	public boolean activateTag(String categoryName, String tagName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return activateTag(this.cred, categoryName, tagName);
	}
	
	public boolean activateTag(UserCredential userCredential, String categoryName, String tagName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return ((Boolean)((Object[])invokeMethod(userCredential, new Object[]{categoryName, tagName}, _qname__ActivateTag, _type_ActivateTag, _type_ActivateTagResponse, "ActivateTag"))[0]).booleanValue();
	}
	
	public boolean createCategory(Category category) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return createCategory(this.cred, category);
	}
	
	public boolean createCategory(UserCredential userCredential, Category category) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return ((Boolean)((Object[])invokeMethod(userCredential, new Object[]{Util.handleCatagoryData(category)}, _qname__CreateCategory, _type_CreateCategory, _type_CreateCategoryResponse, "CreateCategory"))[0]).booleanValue();
	}
	
	public boolean createTag(String categoryName, Tag tag) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return createTag(this.cred, categoryName, tag);
	}
	
	public boolean createTag(UserCredential userCredential, String categoryName, Tag tag) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		//TODO: Handle different tags
		return ((Boolean)((Object[])invokeMethod(userCredential, new Object[]{categoryName, Util.handleTagData(tag)}, _qname__CreateTag, _type_CreateTag, _type_CreateTagResponse, "CreateTag"))[0]).booleanValue();
	}
	
	public boolean deleteTag(String categoryName, String tagName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return deleteTag(this.cred, categoryName, tagName);
	}
	
	public boolean deleteTag(UserCredential userCredential, String categoryName, String tagName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return ((Boolean)((Object[])invokeMethod(userCredential, new Object[]{categoryName, tagName}, _qname__DeleteTag, _type_DeleteTag, _type_DeleteTagResponse, "DeleteTag"))[0]).booleanValue();
	}
	
	public byte[] getBarcode(String categoryName, String tagName, ImageType imageType, float sizeInInches, DecorationType decorationsType, boolean isBlackWhite) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return getBarcode(this.cred, categoryName, tagName, imageType, sizeInInches, decorationsType, isBlackWhite);
	}
	
	public byte[] getBarcode(UserCredential userCredential, String categoryName, String tagName, ImageType imageType, float sizeInInches, DecorationType decorationsType, 
			boolean isBlackWhite) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		Object[] args = new Object[]{categoryName, tagName, new Object[]{imageType.toString()}, new Float(sizeInInches), decorationsType.toString(), new Boolean(isBlackWhite)};
		byte[] result = null;
		try
		{
			result = Base64InputStream.decode((String)((Object[])invokeMethod(userCredential, args, _qname__GetBarcode, _type_GetBarcode, _type_GetBarcodeResponse, "GetBarcode"))[0]);
		}
		catch (IOException e)
		{
		}
		return result;
	}
	
	public String getTagId(String categoryName, String tagName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return getTagId(this.cred, categoryName, tagName);
	}
	
	public String getTagId(UserCredential userCredential, String categoryName, String tagName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return (String)((Object[])invokeMethod(userCredential, new Object[]{categoryName,tagName}, _qname__GetTagId, _type_GetTagId, _type_GetTagIdResponse, "GetTagId"))[0];
	}
	
	public boolean pauseCategory(String categoryName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return pauseCategory(this.cred, categoryName);
	}
	
	public boolean pauseCategory(UserCredential userCredential, String categoryName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return ((Boolean)((Object[])invokeMethod(userCredential, new Object[]{categoryName}, _qname__PauseCategory, _type_PauseCategory, _type_PauseCategoryResponse, "PauseCategory"))[0]).booleanValue();
	}
	
	public boolean pauseTag(String categoryName, String tagName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return pauseTag(this.cred, categoryName, tagName);
	}
	
	public boolean pauseTag(UserCredential userCredential, String categoryName, String tagName) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return ((Boolean)((Object[])invokeMethod(userCredential, new Object[]{categoryName, tagName}, _qname__PauseTag, _type_PauseTag, _type_PauseTagResponse, "PauseTag"))[0]).booleanValue();
	}
	
	public boolean updateCategory(String existingCategoryName, Category category) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return updateCategory(this.cred, existingCategoryName, category);
	}
	
	public boolean updateCategory(UserCredential userCredential, String existingCategoryName, Category category) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return ((Boolean)((Object[])invokeMethod(userCredential, new Object[]{existingCategoryName, Util.handleCatagoryData(category)}, _qname__UpdateCategory, _type_UpdateCategory, _type_UpdateCategoryResponse, "UpdateCategory"))[0]).booleanValue();
	}
	
	public boolean updateTag(String categoryName, String existingTagName, Tag tag) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		return updateTag(this.cred, categoryName, existingTagName, tag);
	}
	
	public boolean updateTag(UserCredential userCredential, String categoryName, String existingTagName, Tag tag) throws RemoteException, ReceiverFault, UserAuthFault, CategoryFault, TagFault, SenderFault
	{
		//TODO: Handle different tags
		return ((Boolean)((Object[])invokeMethod(userCredential, new Object[]{categoryName, existingTagName, Util.handleTagData(tag)}, _qname__UpdateTag, _type_UpdateTag, _type_UpdateTagResponse, "UpdateTag"))[0]).booleanValue();
	}
}
