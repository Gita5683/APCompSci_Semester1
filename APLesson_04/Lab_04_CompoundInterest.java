import java.util.Scanner; 

public class Lab_04_CompoundInterest
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the interest rate:");
		double rate = keyboard.nextDouble();
		System.out.println("Enter the principal:");
		double principal = keyboard.nextDouble();
		System.out.println("Enter the number of times the loan is compounded per year:");
		double number = keyboard.nextDouble();
		System.out.println("Enter the life of the loan in years:");
		double time = keyboard.nextDouble();

		Lab_04_CompoundInterest loan = new Lab_04_CompoundInterest();
		double compInt = loan.payment(rate, principal, number, time);
		System.out.printf("Your total payment is $%.2f", compInt);
		
		
		Lab_04_CompoundInterest monLoan = new Lab_04_CompoundInterest();
		double monCompInt = monLoan.monPayment(rate, principal, number, time);
		System.out.printf("\nYour total montly payment is $%.2f", monCompInt);
	}
	
	public double payment(double r, double p, double n, double t)
	{
		return (p)*Math.pow((1+(r/n)),n*t);
	}
	
	public double monPayment(double r, double p, double n, double t)
	{
		return ((p)*Math.pow((1+(r/n)),n*t))/(t*12);
	}
}