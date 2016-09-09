import java.util.Scanner; //import statment

public class Lab_03_Calculation
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Hello, I am going to calculate the volume of a pyramid. Enter the length of your pyramid in inches.");
		Double length = keyboard.nextDouble();
	
		System.out.println("Wonderful. Now enter the width of your pyramid in inches.");
		Double width = keyboard.nextDouble();
	
		System.out.println("Almost done. Enter the height of your pyramid in inches.");
		Double height = keyboard.nextDouble();
	
		Double volume = ((length * width * height)/3);
	
		System.out.println("The volume of your pyramid is " + volume);
	
	}
	
}