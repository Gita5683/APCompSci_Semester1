import java.util.Scanner; 

public class Notes_Diagram
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the width in inches:");
		int width = keyboard.nextInt();
		System.out.println("Enter the length in inches:");
		int length = keyboard.nextInt();
		
		calcPerim(width, length);
		System.out.println("Your perimeter is " + calcPerim(width, length) + "ft.");
	}
	
	public static int calcPerim(int w, int l)
	{
		return (2*(w+l));
	}
}