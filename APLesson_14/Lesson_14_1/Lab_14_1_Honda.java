public class Lab_14_1_Honda extends Lab_14_1_CarClass
{
	private double xcoor;
	private double ycoor;
	
	public Lab_14_1_Honda(double [] p)
	{
		super();
		move(p[0], p[1]);
	}
	
	public void move(double x, double y)
	{
		this.xcoor += x;
		this.ycoor += y;
	}
	
	public double [] getLoc()
	{
		double [] location = {xcoor, ycoor};
		return location;
	}
}