public class CalculateTime
{
	Months months = new Months();
	Hours hours = new Hours();

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
		int totalMonths = 0;
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
						totalMonths += 1; 
					} else
					{
						totalDays += startingMonth.getMonthDays() % startingDay;
					}
 				//Ending Month
				}else if(month.equals(endingMonth))
				{
	 				totalDays += endingDay;
					totalMonths += 1;
				} 
				//In Between Months
				else
				{
					totalDays += month.getMonthDays();
					totalMonths += 1;
				}
 			}

			//Get total Hours
 			for(int day = 0; day < totalDays; day++)
 			{
 				//Get Starting Day Hours
 				if(day == 1)
 				{
 					if(startingHour.getHour() <= 15)
 					{
 						totalHours += hours.getHours().length - startingHour.getHour();
 					} else
 					{
 						totalHours += hours.getHours().length % startingHour.getHour();
 					}
 				}

 				//Get Ending Day Hours
 				else if (day == totalDays)
 				{
 					totalHours += endingHour.getHour();
 				} 

 				//Get in between Day Hours
	 			else
	 			{
 					totalHours += hours.getHours().length;
	 			}
 			}

			//Get total Minutes
			


			return "You have " + totalMonths + "months and " + totalDays + " days left. With " + totalHours + " hours and " + totalMinutes + ".";

		 
	}
}