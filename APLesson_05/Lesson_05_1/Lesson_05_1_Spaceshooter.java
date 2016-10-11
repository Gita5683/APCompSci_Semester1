import java.util.Scanner;
public class Lesson_05_1_Spaceshooter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter you target: ");
		int target = kb.nextInt();
		int enemyLoc = (int)(Math.random()*100)+1;
		
		if(target == enemyLoc)
			System.out.println("It's a hit!");
		else //in all other conditions but the if above
			System.out.println("Keep trying!");
	}
}