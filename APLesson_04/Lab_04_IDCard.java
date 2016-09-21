import java.util.Scanner; 

public class Lab_04_IDCard
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstname = keyboard.nextLine();
		System.out.println("Enter your last name:");
		String lastname = keyboard.nextLine();
		
		System.out.println("Enter your title:");
		String title = keyboard.nextLine();
		System.out.println("Enter the school site:");
		String site = keyboard.nextLine();

		System.out.println("Enter the school year:");
		String year = keyboard.nextLine();	
		System.out.println("What is your subject:");
		String subject = keyboard.nextLine();
		
		Lab_04_IDCard form = new Lab_04_IDCard();
		
		System.out.print("***********************************");
		
		form.format(site, year);
		form.format(firstname, lastname);
		form.format(title, subject);
		
		System.out.println("\n***********************************");
		
	}
	
	public void format(String a, String b)
	{		
		System.out.printf("\n*%14s %17s *", a, b);
	}
}
		