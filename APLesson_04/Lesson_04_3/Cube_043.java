import java.util.Scanner;
public class Cube_043
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		//intialize variables
		System.out.println("Please enter side length: ");
		double side = kb.nextDouble();
		print(calcSurfaceArea(side));
	}
	
	public static double calcSurfaceArea(double s)
	{
		return (6*(s*s));
	}
	public static void print(double surfaceArea)
	{
		//print using the new surfaceArea value
		System.out.printf("The surface area of your rectangle is %.5f", surfaceArea);
	}
}