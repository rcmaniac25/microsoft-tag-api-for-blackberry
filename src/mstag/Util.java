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
			if(index == -1)
			{
				buf.append("+00:00");
			}
		}
		if(index != -1)
		{
			buf.append(zoneID.substring(index + 1));
		}
		return buf.toString();
	}
}
