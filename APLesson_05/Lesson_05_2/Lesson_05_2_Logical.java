import java.util.Scanner;
public class Lesson_05_2_Logical
{
	public static void main(String[]args)
	{
		//boolean a = false;
		//boolean b = false;
		
		//System.out.println(a && b);
		//System.out.println(a || b);
		//System.out.println(!(a && b) );
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 10: ");
		int guess = kb.nextInt();
		if(guess >= 1 && guess <= 10)
		{
			System.out.println("The number is right!");
		}
		else
		{
			System.out.println("Wrong!");
		}
	}
}