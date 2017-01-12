import java.util.Scanner;
public class Lab_12_1_HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter hair type: ");
		String hair = kb.nextLine();
		System.out.println("Please enter eye color: ");
		String eyes = kb.nextLine();
		System.out.println("Please enter skin color: ");
		String skin = kb.nextLine();
		
		Lab_12_1_Human object = new Lab_12_1_Human(hair, eyes, skin);
		System.out.println();
		System.out.println("My Info.......");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		
		System.out.println();
		object.setHair("blonde");
		object.setEyes("blue");
		object.setSkin("tan");
		System.out.println("Friend's Info.......");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		
	}
}