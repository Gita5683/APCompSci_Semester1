import static java.lang.Math.*;
public class Lab_12_MPHClass
{
	private Integer distance, hours, minutes;
	private double mph;
	
	public Lab_12_MPHClass()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0.0;
	}
	
	public Lab_12_MPHClass(int dis, int hr, int min)
	{
		distance = dis;
		hours = hr;
		minutes = min;
		mph = 0.0;
	}
	
	public void setDistance(int d)
	{
		distance = d;
	}
	public void setHours(int h)
	{
		hours = h;
	}
	public void setMinutes(int m)
	{
		minutes = m;
	}
	
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
}