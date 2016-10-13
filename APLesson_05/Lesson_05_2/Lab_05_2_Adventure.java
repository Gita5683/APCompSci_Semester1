import java.util.Scanner;
public class Lab_05_2_Adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Would you like to go to..." +
							"\n 1. Go to Australia" +
							"\n 2. Go to New Zealand");
		int location = kb.nextInt();
		if(location == 1)
		{
			System.out.println("Where would you like to go in Australia?");
			String locationAus = kb.next();
			if(locationAus.equals("Sydney"))
			{
				System.out.println("Would you like to..." +
							"\n 1. Watch the cricket team play?" +
							"\n 2. Go to the beach?");;
				int activitySyd = kb.nextInt();
				if(activitySyd == 1)
					System.out.println("Yay! We will go see my favorite cricket team play!");
				else
					System.out.println("I'll go get my bathing suit!");
			}
			else
			{
				System.out.println("Oh I don't want to go there. Would you like to go to Sydney?");
				String locationSyd = kb.next();
				if(locationSyd.equals("Yes"))
					System.out.println("Yay! We will go to Sydney!");
				else
					System.out.println("Oh, then we can't go to Australia together.");
			}
			
		}
		else
		{
			System.out.println("Where would you like to go in New Zealand?");
			String locationNZ = kb.next();
			if(locationNZ.equals("Otago"))
			{
				System.out.println("Would you like to..." +
							"\n 1. Watch the cricket team play?" +
							"\n 2. See where The Hobbit Trilogy was filmed?");
				int activityOta = kb.nextInt();
				if(activityOta == 1)
					System.out.println("Sweet! Let's go see a cricket match!");
				else
					System.out.println("Yay! I'm excited to see The Hobbit set!");
			}
			else
			{
				System.out.println("Sorry, we can't go there. Would you like to go to Otago?");
				String locationOta = kb.next();
				if(locationOta.equals("Yes"))
					System.out.println("Yay! We will go to Otago!");
				else
					System.out.println("Oh, then we can't go to New Zealand together.");
			}
		}
	}
}