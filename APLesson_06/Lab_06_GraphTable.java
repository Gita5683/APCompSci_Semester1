import java.util.Scanner;
public class Lab_06_GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = kb.nextInt();
		System.out.println("Please enter a size for your table: ");
		int size = kb.nextInt();
		System.out.println(" ");
		
		for(int i = 1; i <= size; i++)
		{
			System.out.printf("%5d\t%5d\n", i, i*number);
		}
	}
}