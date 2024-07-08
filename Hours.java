public class Hours
{
	//Hours list
	HoursObject[] hours = new HoursObject[24];

	public genHours()
	{
		for(int i = 0; i < hours.length; i++)
		{
			hours[i] = new HoursObject(i+1, 60, 60);
		}
	}
}