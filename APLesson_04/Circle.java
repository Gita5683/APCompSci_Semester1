import java.util.Scanner;
public class Circle
{
	static double radius;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a radius:");
		radius = kb.nextDouble();
		
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = (2*radius*3.14);
	}
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of " + radius + " is %.5f", area);
	}
}