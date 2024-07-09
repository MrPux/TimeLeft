public class HourObject
{
	private int hour;
	private int minutes;
	private int seconds;

	public HourObject(int hour, int minutes, int seconds)
	{
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	//Getters
	public int getHour()
	{
		return this.hour;
	}

	public int getMinutes()
	{
		return minutes;
	}

	public int getSeconds()
	{
		return seconds;
	}

	@Override

	public String toString()
	{
		return "Hour: " + hour + " has" + minutes + " and " + seconds;
	}
}