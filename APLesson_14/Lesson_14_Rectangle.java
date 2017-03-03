public class Lesson_14_Rectangle implements Lesson_14_CutShapes
{
	double sideA, sideB;
	public Lesson_14_Rectangle()
	{
		sideA = sideB = 0;
	}
	
	public Lesson_14_Rectangle(double a, double b)
	{
		sideA = a;
		sideB = b;
	}
	
	public double getSideA()
	{
		return sideA;
	}
	
	public double getSideB()
	{
		return sideB;
	}
	
	public double getArea()
	{
		return sideA * sideB;
	}
}