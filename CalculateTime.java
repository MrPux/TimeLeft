public class CalculateTime
{
	Months months = new Months();

	private MonthObject startingMonth;
	private MonthObject endingMonth;

	private int startingDay;
	private int endingDay;

	private HourObject startingHour;
	private HourObject endingHour;

	public CalculateTime (MonthObject startingMonth, MonthObject endingMonth, int startingDay, int endingDay, HourObject startingHour, HourObject endingHour)
	{
		this.startingMonth = startingMonth;
		this.endingMonth = endingMonth;

		this.startingDay = startingDay;
		this.endingDay = endingDay;

		this.startingHour = startingHour;
		this.endingHour = endingHour;
	}

	public String timeLeft()
	{
		int totalDays = 0;
		int totalHours = 0;
		int totalMinutes = 0;

			//Get total Month Days
			for(MonthObject month : months.getMonths())
			 {

				//First Month
				if(month.equals(startingMonth))
				{
					if(startingDay <= 15)
					{
						totalDays += startingMonth.getMonthDays() - startingDay; 
					} else
					{
						totalDays += startingMonth.getMonthDays() % startingDay;
					}
 				//Ending Month
				}else if(month.equals(endingMonth))
				{
	 				totalDays += endingDay;
				} 
				//In Between Months
				else
				{
					totalDays += month.getMonthDays();
				}
 			}
			return "";


			//Get total Hours

			//Get total Minutes

		 
	}
}