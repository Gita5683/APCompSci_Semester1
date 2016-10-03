import java.util.Scanner;
public class Rectangle_043
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		//intialize variables
		System.out.println("Please enter your length: ");
		double l = kb.nextDouble();
		System.out.println("Please enter your height: ");
		double w = kb.nextDouble();
		print(calcPerim(l,w));
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	}
	public static void print(double perimeter)
	{
		//print using the new perimeter value
		System.out.printf("The perimeter of your rectangle is %.5f", perimeter);
	}
}