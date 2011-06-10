/**
 * This software is distributed under Microsoft Public License (MSPL)
 * see http://opensource.org/licenses/ms-pl.html
 * 
 * @author Vincent Simonetti
 */
package mstag;

import java.util.Calendar;

import net.rim.device.api.i18n.SimpleDateFormat;

/**
 * Simple utility class, might be removed later.
 */
public class Util
{
	public static String toSOAPString(Calendar cal)
	{
		if(cal == null)
		{
			return null;
		}
		StringBuffer buf = new StringBuffer();
		
		//Get format
		new SimpleDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS").format(cal, buf, null);
		buf.append("0000");
		
		//Timezone
		String zoneID = cal.getTimeZone().getID();
		int index = zoneID.indexOf('-');
		if(index == -1)
		{
			index = zoneID.indexOf('+');
			/* If no timezone offset exists, it isn't needed
			if(index == -1)
			{
				buf.append("+00:00");
			}
			*/
		}
		if(index != -1)
		{
			buf.append(zoneID.substring(index + 1));
		}
		return buf.toString();
	}
	
	public static Object[] handleTagData(Tag tag)
	{
		Object[] tagObject = new Object[7 + tagSpecificSize(tag)];
		tagObject[0] = tag.title;
		tagObject[1] = tag.note;
		tagObject[2] = tag.status.toString();
		tagObject[3] = tag.type.toString();
		tagObject[4] = Util.toSOAPString(tag.start);
		tagObject[5] = Util.toSOAPString(tag.end);
		tagObject[6] = tag.apay;
		tagSpecificObjects(tag, tagObject);
		return tagObject;
	}
	
	private static int tagSpecificSize(Tag tag)
	{
		//TODO
		return 0;
	}
	
	private static void tagSpecificObjects(Tag tag, Object[] tagObject)
	{
		//TODO
	}
}
