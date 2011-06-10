/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public final class DecorationType
{
	private static final int HCCBRP_DECORATION_NONE_VALUE = 0;
	private static final int HCCBRP_DECORATION_DOWNLOAD_VALUE = 3;
	private static final int HCCBENCODEFLAG_STYLIZED_VALUE = 0x13;
	private static final int HCCBRP_DECORATION_FRAMEPLAIN_VALUE = 8;
	private static final int HCCBRP_DECORATION_TEXT_VALUE = 0x20;
	
	/**
	 * Just the Tag.
	 */
	public static final DecorationType HCCBRP_DECORATION_NONE = new DecorationType(HCCBRP_DECORATION_NONE_VALUE);
	/**
	 * The Tag along with instructions on how to use the Tag and where to get software for the Tag.
	 */
	public static final DecorationType HCCBRP_DECORATION_DOWNLOAD = new DecorationType(HCCBRP_DECORATION_DOWNLOAD_VALUE);
	/**
	 * Similar to the {@link HCCBRP_DECORATION_DOWNLOAD} decoration, the Tag itself is returned so it is appropriate for making custom Tags.
	 */
	public static final DecorationType HCCBENCODEFLAG_STYLIZED = new DecorationType(HCCBENCODEFLAG_STYLIZED_VALUE);
	/**
	 * The Tag and a link for where to download the Tag software.
	 */
	public static final DecorationType HCCBRP_DECORATION_FRAMEPLAIN = new DecorationType(HCCBRP_DECORATION_FRAMEPLAIN_VALUE);
	/**
	 * Image type is disregarded when this decoration is used, this will return String data that is the hexidecimal representation of the Tag.
	 */
	public static final DecorationType HCCBRP_DECORATION_TEXT = new DecorationType(HCCBRP_DECORATION_TEXT_VALUE);
	
	private int value;
	
	private DecorationType(int value)
	{
		this.value = value;
	}
	
	public String toString()
	{
		switch(this.value)
		{
			case HCCBRP_DECORATION_NONE_VALUE:
				return "HCCBRP_DECORATION_NONE";
			case HCCBRP_DECORATION_DOWNLOAD_VALUE:
				return "HCCBRP_DECORATION_DOWNLOAD";
			case HCCBENCODEFLAG_STYLIZED_VALUE:
				return "HCCBENCODEFLAG_STYLIZED";
			case HCCBRP_DECORATION_FRAMEPLAIN_VALUE:
				return "HCCBRP_DECORATION_FRAMEPLAIN";
			case HCCBRP_DECORATION_TEXT_VALUE:
				return "HCCBRP_DECORATION_TEXT";
		}
		return null;
	}
}
