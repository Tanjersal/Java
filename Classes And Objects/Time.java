//Time class to maintain the time in 24hr format

public class Time 
{
	//instances variables
	private int hour;
	private int minute;
	private int second;
	
	//function to setTime using universal time - setter
	public void setTime(int h, int mn, int s)
	{
		//validate hour, mn, s
		if ((h >= 0 && h<24) && (mn>=0 && mn<60) && (s>=0 && s<60))
		{
			hour = h;
			minute = mn;
			second = s;
		}
		else
		{
			throw new IllegalArgumentException("hour, minute and/or second was out of range");
		}
	}
	
	//function to convert to string in universal time (HH:MM:SS)
	public String toUniversalString()
	{
		return String.format("%02d:%02d:%02d", hour, minute, second);
		
	}
	
	//function to convert to string in standard-time format(H:MM:SS AM or PM)
	public String toString()
	{
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12 ), minute, second, (hour<12 ? "AM" : "PM"));
		
	}
}
