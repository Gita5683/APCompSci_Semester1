public class Lesson_14_Circle implements Lesson_14_CutShapes
{
	private double radius;
	// private final double number = 87;
	
	public Lesson_14_Circle()
	{
		radius = 0;
	}
	
	public Lesson_14_Circle(double r)
	{
		radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return pi * Math.pow(radius, 2);
	}
}