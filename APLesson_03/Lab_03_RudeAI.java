import java.util.Scanner; //import statment

public class Lab_03_RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = keyboard.nextLine();
		System.out.println(name + " Huh? That's an odd name, I feel sorry for you.");
		
		System.out.println("How old are you? ");
		int age = keyboard.nextInt();
		System.out.println(age + "! Ahh hitting those middle-age years I see.");
		
		System.out.println("What do you do for fun, " + name + " ?");
		String fun = keyboard.next();
		System.out.println("Wait, actually? " + fun + " sounds kinda boring, no offense.");
		
		System.out.println("What kind of music do you like? ");
		String music = keyboard.next();
		System.out.println("Eew! I wouldn't wish the sound of " + music + " on my worst enemy.");
		
		System.out.println("How many siblings do you have? ");
		int siblings = keyboard.nextInt();
		System.out.println(siblings + "? Oh, are they the ones who have the good-looking genes?");
		
		System.out.println("What do you want to be when you grow up? ");
		String career = keyboard.next();
		System.out.println("Wow " + career + " makes me not want to be your friend.");
		
	}
}