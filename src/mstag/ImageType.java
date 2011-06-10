/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

public final class ImageType
{
	private static final int PDF_VALUE = 1;
	private static final int WMF_VALUE = PDF_VALUE + 1;
	private static final int JPEG_VALUE = WMF_VALUE + 1;
	private static final int PNG_VALUE = JPEG_VALUE + 1;
	private static final int GIF_VALUE = PNG_VALUE + 1;
	private static final int TIFF_VALUE = GIF_VALUE + 1;
	private static final int TAG_VALUE = TIFF_VALUE + 1;
	
	public static final ImageType PDF = new ImageType(PDF_VALUE);
	public static final ImageType WMF = new ImageType(WMF_VALUE);
	public static final ImageType JPEG = new ImageType(JPEG_VALUE);
	public static final ImageType PNG = new ImageType(PNG_VALUE);
	public static final ImageType GIF = new ImageType(GIF_VALUE);
	public static final ImageType TIFF = new ImageType(TIFF_VALUE);
	public static final ImageType TAG = new ImageType(TAG_VALUE);
	
	private int value;
	
	private ImageType(int value)
	{
		this.value = value;
	}
	
	public String toString()
	{
		switch(this.value)
		{
			case PDF_VALUE:
				return "pdf";
			case WMF_VALUE:
				return "wmf";
			case JPEG_VALUE:
				return "jpeg";
			case PNG_VALUE:
				return "png";
			case GIF_VALUE:
				return "gif";
			case TIFF_VALUE:
				return "tiff";
			case TAG_VALUE:
				return "tag";
		}
		return null;
	}
}
