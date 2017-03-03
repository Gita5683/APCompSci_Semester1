public class Lab_14_Toyota implements Lab_14_Location
{
	private double[] location;
	private double xcoor;
	private double ycoor;
	
	public Lab_14_Toyota()
	{
		location = new double[2];
	}
	
	public Lab_14_Toyota(String c)
	{
		xcoor = Double.parseDouble(c.substring(0,1));
		ycoor = Double.parseDouble(c.substring(3));
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