public class Months 
{ 
	//List Declaration
	MonthObject[] months = new MonthObject[12]; 
	// Month array Initialization
	private String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	// Month Days array Initialization
	private int[] monthDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	// Gen Month Object
	public void genMonths() 
	{
		for(int i = 0; i < months.length; i++){
			months[i] = new MonthObject(monthNames[i], monthDays[i], i+1);
		}
	}

	// Getters
	public MonthObject[] getMonths()
	{
		return months;
	}

} 