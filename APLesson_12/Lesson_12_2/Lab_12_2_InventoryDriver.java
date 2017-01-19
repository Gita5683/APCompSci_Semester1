import java.util.Scanner;
public class Lab_12_2_InventoryDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Lab_12_2_Inventory object;
		System.out.println("Please enter manufacturer: ");
		String manufacturer = kb.next();
		System.out.println("Please enter name: ");
		String name = kb.next();
		System.out.println("Would you like to enter category and price information, Yes or No? ");
		String response = kb.next();
		
		if(response.equals("No"))
		{
			object = new Lab_12_2_Inventory(manufacturer, name);
			System.out.println();
			System.out.println(object);	
		}
		else
		{
			System.out.println("Please enter the category: ");
			String category = kb.next();
			System.out.println("Please enter the price: ");
			double price = kb.nextDouble();
			object = new Lab_12_2_Inventory(manufacturer, name, category, price);
			System.out.println();
			System.out.println(object);
		}
	}
}
