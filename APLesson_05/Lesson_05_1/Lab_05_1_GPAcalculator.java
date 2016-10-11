import java.util.Scanner;
public class Lab_05_1_GPAcalculator
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your language letter grade: ");
		String language = kb.next(); 
		
		System.out.println("Enter your math letter grade: ");
		String math = kb.next();
		
		System.out.println("Enter your history letter grade: ");
		String history = kb.next();
		
		System.out.println("Enter your science letter grade: ");
		String science = kb.next();
		
		System.out.println("Enter your physics letter grade: ");
		String physics = kb.next();
		
		System.out.println("Enter your english letter grade: ");
		String english = kb.next();
		
		System.out.println("Enter your psychology letter grade: ");
		String psychology = kb.next();
		
		double gPoints = calcPoints(language) + calcPoints(math) + calcPoints(history) + calcPoints(science) + calcPoints(physics) + calcPoints(english) + calcPoints(psychology);
		System.out.println("Your GPA is " + (gPoints/7));
	}
	
	public static double calcPoints(String grade)
	{
		double points = 0.0;
		
		if (grade.equals("A"))
			points = 4.0;
		if (grade.equals("B"))
			points = 3.0;
		if (grade.equals("C"))
			points = 2.0;
		if (grade.equals("D"))
			points = 1.0;
		if (grade.equals("F"))
			points = 0.0;
		
		return points;
	}
}
