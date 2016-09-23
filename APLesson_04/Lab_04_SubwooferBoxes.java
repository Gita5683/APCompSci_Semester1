import java.util.Scanner; 

public class Lab_04_SubwooferBoxes
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the height in inches:");
		int height = keyboard.nextInt();
		System.out.println("Enter the length in inches:");
		int length = keyboard.nextInt();
		System.out.println("Enter the width in inches:");
		int width = keyboard.nextInt();

		Lab_04_SubwooferBoxes volume = new Lab_04_SubwooferBoxes();
		double subwooferBoxes = volume.calcVolume(height, length, width);
		System.out.printf("The volume of your subwoofer box is %.10f ft^3", subwooferBoxes);
	}
	
	public double calcVolume(int h, int l, int w)
	{
		return ((h*l*w)* 0.00057870);
	}
}