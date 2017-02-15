public abstract class Lab_13_2_TicketSuperclass
{
	private int serialNo;
	
	public Lab_13_2_TicketSuperclass()
	{
		this.serialNo = 0;
	}
	
	public int getSerialNo()
	{
		return (int)(Math.random() * 10000000) + 1;
	}
	
	public abstract int getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
	
	
}