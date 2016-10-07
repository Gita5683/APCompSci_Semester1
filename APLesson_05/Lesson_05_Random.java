import java.util.Random;
public class Lesson_05_Random
{
	public static void main(String[]args)
	{
		int num = (int) (1+Math.random()*101);
		System.out.println(num);
		
		Random rand = new Random();
		int num1 = rand.nextInt(3)+1;
		System.out.println(num1);
		
	}
}