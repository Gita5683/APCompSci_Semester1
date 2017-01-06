import java.util.Scanner;
public class Lab_12_MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter miles: ");
		int distance = kb.nextInt();
		System.out.println("Please enter hours: ");
		int hours = kb.nextInt();
		System.out.println("Please enter minutes: ");
		int minutes = kb.nextInt();
		
		Lab_12_MPHClass object = new Lab_12_MPHClass(distance, hours, minutes);
		System.out.println(distance + " miles in " + hours + " hours = " + object.getMPH() + " mph." );
		
		object.setDistance(distance);
		object.setHours(hours);
		object.setMinutes(minutes);
		System.out.println(distance + " miles in " + hours + " hours = " + object.getMPH() + " mph." );
	
	}
}