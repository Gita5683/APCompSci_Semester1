import java.util.Scanner;
public class Lab_07_DigitAdder
{
	static int num;
	static int sum;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		num = kb.nextInt();
		sum = 0;
		sumDigits();
		
		System.out.println("The sum of the digits in " + num + " is " + sum);
	}
	
	public static void sumDigits()
	{
		int number = num;
		while(number > 0)
		{
			sum += number %10;
			number /= 10;
		}
	}
	
}