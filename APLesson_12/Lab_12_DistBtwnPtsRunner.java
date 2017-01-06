import java.util.Scanner;
public class Lab_12_DistBtwnPtsRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter x1 coordinate: ");
		int x1 = kb.nextInt();
		System.out.println("Please enter y1 coordinate: ");
		int y1 = kb.nextInt();
		System.out.println("Please enter x2 coordinate: ");
		int x2 = kb.nextInt();
		System.out.println("Please enter y2 coordinate: ");
		int y2 = kb.nextInt();
		
		Lab_12_DistBtwnPtsClass object = new Lab_12_DistBtwnPtsClass(x1, y1, x2, y2);
		System.out.println("distance = " + object.getDistance());
		
		object.setxOne(x1);
		object.setyOne(y1);
		object.setxTwo(x2);
		object.setyTwo(y2);
		System.out.println("distance = " + object.getDistance());
	}
}