import java.util.Scanner;
public class Rectangle
{
	static double length;
	static double width;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a value for length:");
		length = kb.nextDouble();
		System.out.println("Please enter a value for width:");
		width = kb.nextDouble();
		
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = (2*length)+(2*width);
	}
	public static void print()
	{
		System.out.printf("Your rectangle is %.5f ft. around", perimeter);
	}
}