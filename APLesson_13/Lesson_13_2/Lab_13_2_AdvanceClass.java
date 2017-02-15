public class Lab_13_2_AdvanceClass extends Lab_13_2_TicketSuperclass
{
	private int daysLeft;
	
	public Lab_13_2_AdvanceClass()
	{
		super();
	}
	
	public Lab_13_2_AdvanceClass(int d)
	{
		super();
	}
	
	public int getPrice()
	{
		if(daysLeft >= 10)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}
}