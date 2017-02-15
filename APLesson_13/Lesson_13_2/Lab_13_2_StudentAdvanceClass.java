public class Lab_13_2_StudentAdvanceClass extends Lab_13_2_AdvanceClass
{
	
	public Lab_13_2_StudentAdvanceClass()
	{
		super();
	}
	
	public int getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice() + "\nStudent ID Required";
	}
}