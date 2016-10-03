import java.util.Scanner;
public class Average_043
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		//intialize variables
		System.out.println("Please enter first number: ");
		double num1 = kb.nextDouble();
		System.out.println("Please enter second number: ");
		double num2 = kb.nextDouble();
		System.out.println("Please enter third number: ");
		double num3 = kb.nextDouble();
		print(num1, num2, num3, calcAverage(num1, num2, num3));
	}
	
	public static double calcAverage(double a, double b, double c)
	{
		return ((a+b+c)/3);
	}
	public static void print(double num1, double num2, double num3, double average)
	{
		//print using the new average value
		System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is %.5f", average);
	}
}