import java.util.Scanner;
public class Lab_12_1_CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a paint color: ");
		String paint = kb.nextLine();
		System.out.println("Please entier an interior type: ");
		String interior = kb.nextLine();
		System.out.println("Please enter an engine type: ");
		String engine = kb.nextLine();
		System.out.println("Please enter a tire type: ");
		String tires = kb.nextLine();
		
		Lab_12_1_Car object = new Lab_12_1_Car(paint, interior, engine, tires);
		System.out.println();
		System.out.println("Your vehicle is ready.......");
		System.out.println("Paint: " + object.getPaint());
		System.out.println("Interior: " + object.getInterior());
		System.out.println("Engine: " + object.getEngine());
		System.out.println("Tires: " + object.getTires());
		
		System.out.println();
		System.out.println("Your vehicle is ready.......");
		
	}
}