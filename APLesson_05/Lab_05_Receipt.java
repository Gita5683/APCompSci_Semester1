import java.util.Scanner;
public class Lab_05_Receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter first item: ");
		String item1 = kb.next();
		System.out.println("Please enter price of first item: ");
		double price1 = kb.nextDouble();
		
		System.out.println("Please enter second item: ");
		String item2 = kb.next();
		System.out.println("Please enter price of second item: ");
		double price2 = kb.nextDouble();
		
		System.out.println("Please enter third item: ");
		String item3 = kb.next();
		System.out.println("Please enter price of third item: ");
		double price3 = kb.nextDouble();
		
		System.out.println("Please enter fourth item: ");
		String item4 = kb.next();
		System.out.println("Please enter price of fourth item: ");
		double price4 = kb.nextDouble();
		
		double subtotal = (price1 + price2 + price3 + price4);
		double tax = .08*(subtotal);
		double discount = discount(price1, price2, price3, price4);
		double total = subtotal - (discount + tax);
		
		Lab_05_Receipt form = new Lab_05_Receipt();
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>>>>>>");
		
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format(item4, price4);
		System.out.println();
		form.format("Subtotal: ", subtotal);
		form.format("Tax: ", tax);
		form.format("Discount: ", discount);
		form.format("Total: ", total);
		System.out.println();
		System.out.println("_____________________________________________________");
		System.out.println();
		System.out.println("\t\tThank you for shopping with us!");
	}
	
	public static double discount(double p1, double p2, double p3, double p4)
	{
		double discount = 0;
		
		if((p1+p2+p3+p4) >= 2000)
		{
			discount = (p1+p2+p3+p4)*.15;
		}
		
		if((p1+p2+p3+p4) < 2000)
		{
			discount = 0;
		}
		
		return discount;
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n*\t%15s . . . . . . . . %10.2f", item, price);
	}
	
}