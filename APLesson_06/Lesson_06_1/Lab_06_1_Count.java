import java.util.Scanner;
public class Lab_06_1_Count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a maximum number: ");
		int max = kb.nextInt();
		System.out.println("Please enter a counting number: ");
		int count = kb.nextInt();
		System.out.println(" ");
		
		for(int i = count; i <= max; i += count)
		{
			System.out.print(i + "\t");
		}
	}
	
	
}