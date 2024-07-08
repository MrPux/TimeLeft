public class MonthObject 
{
	private String name;
	private int days;
	private int monthNum;


	public MonthObject(String name, int days, int monthNum)
	{
		this.name = name;
		this.days = days;
		this.monthNum = monthNum;
	}

	// Getters
	public String getMonthName()
	{
		return this.name; 
	}

	public int getMonthDays()
	{
		return this.days;
	} 

	public int getMonthNum()
	{
		return this.monthNum;
	}

	public String toString()
	{
		return "Month: " + name + " has " + days + " days. Month is " + monthNum + "/12. ";
	}

}