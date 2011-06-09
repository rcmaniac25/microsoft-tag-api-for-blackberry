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
	
	public static final DecorationType HCCBRP_DECORATION_NONE = new DecorationType(HCCBRP_DECORATION_NONE_VALUE);
	public static final DecorationType HCCBRP_DECORATION_DOWNLOAD = new DecorationType(HCCBRP_DECORATION_DOWNLOAD_VALUE);
	public static final DecorationType HCCBENCODEFLAG_STYLIZED = new DecorationType(HCCBENCODEFLAG_STYLIZED_VALUE);
	public static final DecorationType HCCBRP_DECORATION_FRAMEPLAIN = new DecorationType(HCCBRP_DECORATION_FRAMEPLAIN_VALUE);
	public static final DecorationType HCCBRP_DECORATION_TEXT = new DecorationType(HCCBRP_DECORATION_TEXT_VALUE);
	
	protected int value;
	
	private DecorationType(int value)
	{
		this.value = value;
	}
}
