public class Lab_14_GMC implements Lab_14_Location
{
	private double xcoor;
	private double ycoor;
	
	public Lab_14_GMC()
	{
		xcoor = ycoor = 0;
	}
	
	public Lab_14_GMC(double x, double y)
	{
		xcoor = x;
		ycoor = y;
	}
	
	public int getID()
	{
		return (int) (Math.random() * 1000000) + 1;
	}
	
	public void move(double x, double y)
	{
		xcoor = x;
		ycoor = y;
	}
	
	public double[] getLoc()
	{
		double [] location = {xcoor, ycoor};  
		return location;
	}
}