import java.util.ArrayList;
import java.util.Scanner;

public class Lesson_13_Inheritance_CountingMachine
{
	public static void main(String[]args)	
	{
		double total = 0.0;
		ArrayList<Lesson_13_Inheritance_Money> inventory = new ArrayList<Lesson_13_Inheritance_Money>();
		inventory.add(new Lesson_13_Inheritance_Coin("Penny", "2.5g", 00.01));
		inventory.add(new Lesson_13_Inheritance_Coin("Nickel", "5.0g", 00.05));
		inventory.add(new Lesson_13_Inheritance_Coin("Dime", "2.268g", 00.10));
		inventory.add(new Lesson_13_Inheritance_Coin("Quarter", "5.670g", 00.25));
		inventory.add(new Lesson_13_Inheritance_Bill("One", "Washington", 01.00));
		inventory.add(new Lesson_13_Inheritance_Bill("Five", "Lincoln", 05.00));
		inventory.add(new Lesson_13_Inheritance_Bill("Ten", "Hamilton", 10.00));
		inventory.add(new Lesson_13_Inheritance_Bill("Twenty", "Jackson", 20.00));
		inventory.add(new Lesson_13_Inheritance_Bill("Hundred", "Franklin", 100.00));
		
		/* for(Lesson_13_Inheritance_Money x : inventory)
		{
			System.out.println(x);
		} */
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your bills and coins: ");
		String cash = kb.nextLine();
		Scanner scan = new Scanner(cash);
		
		while(scan.hasNext())
		{
			String x = scan.next();
			
			for(Lesson_13_Inheritance_Money b : inventory)
			{
				if(b.scan().equals(x)|| b.getName().equals(x))
				{
					b.setCount(b.getCount() + 1);
				}
			}
		}
		
		for(Lesson_13_Inheritance_Money x : inventory)
		{
			total += x.getValue() * x.getCount();
		}
		
		System.out.println(total);
	}	
}