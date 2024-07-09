public class Hours
{
	//Hours list
	HourObject[] hours = new HourObject[24];

	public void genHours()
	{
		for(int i = 0; i < hours.length; i++)
		{
			hours[i] = new HourObject(i+1, 60, 60);
		}
	}

	public HourObject[] getHours()
	{
		return hours;
	}
}