import java.util.Scanner; 

public class Lab_04_Receipt
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Please enter item 2:");
		String item2 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price2 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Please enter item 3:");
		String item3 = keyboard.nextLine();	
		System.out.println("Please enter the price:");
		double price3 = keyboard.nextDouble();
		
		String subtotal = "Subtotal:";
		double Subtotal = (price1 + price2 + price3);
		String tax = "Tax:";
		double Tax = 0.05*(price1 + price2+ price3);
		String total = "Total:";
		double Total = (Subtotal + Tax);
		
		Lab_04_Receipt form = new Lab_04_Receipt();
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>>>>>>");
		
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println();
		form.format(subtotal, Subtotal);
		form.format(tax, Tax);
		form.format(total,Total);
		
		System.out.println("\n _______________________________________________________\n * Thank you for your support *");
		
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n*\t%15s . . . . . . . . %10.2f", item, price);
	}
	
}