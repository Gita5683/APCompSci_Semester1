import java.util.Scanner;
public class Lab_05_1_BMIpart2
{
	static double height;
	static double weight;
	static double BMI;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your height in inches: ");
		height = kb.nextDouble(); 
		
		System.out.println("Enter your weight in pounds: ");
		weight = kb.nextDouble();
		
		BMI = 0.0;
		condition = " ";	
		calcBMI();
		
		System.out.println("Your BMI is " + BMI);
		System.out.println("Your condition is " + condition);
	}
	
	public static void calcBMI()
	{
		BMI = (703*((weight)/(height*height)));
		
		if (BMI <= 18.5)
			condition = "underweight";
		else if (BMI <= 24.9)
			condition = "normal";
		else if (BMI <= 29.9)
			condition = "overweight";
		else if (BMI <= 34.9)
			condition = "obese";
		else if (BMI <= 39.9)
			condition = "very obese";
		else
			condition = "morbidly obese";
	}
}