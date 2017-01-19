import java.util.Scanner;
public class Lab_12_2_UserDriver
{
	public static void main(String[]args)
	{
		/* Lab_12_2_User pH = new Lab_12_2_User("Professor", "Handsome");
		System.out.println(pH);
		System.out.println();
		Lab_12_2_User pH2 = new Lab_12_2_User("Professor", "Handsome", "profHansizzle");
		System.out.println(pH2); */

		Scanner kb = new Scanner(System.in);
		Lab_12_2_User object;
		System.out.println("Please enter your first name: ");
		String firstName = kb.next();
		System.out.println("Please enter your last name: ");
		String lastName = kb.next();
		System.out.println("Would you like a public avatar, Yes or No? ");
		String response = kb.next();
		
		if(response.equals("No"))
		{
			object = new Lab_12_2_User(firstName, lastName);
			System.out.println();
			System.out.println(object);	
		}
		else
		{
			System.out.println("Please enter your avatar: ");
			String avatar = kb.next();
			object = new Lab_12_2_User(firstName, lastName, avatar);
			System.out.println();
			System.out.println(object);
		}
		
		object.setAvatar("Mona");
		System.out.println();
		System.out.println(object);
	}
}
