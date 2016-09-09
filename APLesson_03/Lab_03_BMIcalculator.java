import java.util.Scanner; //import statment

public class Lab_03_BMIcalculator
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi! I am going to calculate your BMI. Enter your height in inches.");
		Double height = keyboard.nextDouble();
		
		System.out.println("Great. Now enter your weight in pounds.");
		Double weight = keyboard.nextDouble();
		
		Double BMI = (703*((weight)/(height*height)));
		
		System.out.println("Your BMI is " + BMI);
	}
}