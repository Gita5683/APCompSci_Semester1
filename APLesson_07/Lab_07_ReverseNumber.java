import java.util.Scanner;
public class Lab_07_ReverseNumber
{
	static int number;
	static int reverse;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		reverse = 0;
		getReverse();
		
		System.out.println(number + " reversed is " + reverse);
	}
	
	public static void getReverse()
	{
		int num = number;
		while(num > 0)
		{
			reverse *= 10;
			reverse += (num %10);
			num /= 10;
		}
	}
}