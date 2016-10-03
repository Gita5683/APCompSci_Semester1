import java.util.Scanner;
public class Circle_043
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		//intialize variables
		System.out.println("Please enter a radius: ");
		double radius = kb.nextDouble();
		print(radius, calcArea(radius));
	}
	
	public static double calcArea(double r)
	{
		return (2*r*3.14);
	}
	public static void print(double radius, double area)
	{
		//print using the new average value
		System.out.printf("The area of a circle with a radius of " + radius + " is %.5f", area);
	}
}