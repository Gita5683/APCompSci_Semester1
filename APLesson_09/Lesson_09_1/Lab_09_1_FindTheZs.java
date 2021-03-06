import java.util.Scanner;
public class Lab_09_1_FindTheZs
{
	static String words[];
	public static void main(String[]args)
	{
		String[] words = new String[5];
		
		fillArray(words);
		System.out.println("For the words...");
		printArray(words);
		System.out.println();
		System.out.println("Only " + hasZs(words) + " contain(s) the letter z.");
	}
	
	public static void fillArray(String[] array)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		for(int i = 0; i < array.length; i++)
		{
			array[i] = kb.next();
		}
	}
	
	public static void printArray(String[] array)
	{
		for(String word : array)
		{
			System.out.print(word + " ");
		}
	}
	
	public static String hasZs(String[] array)
	{
		String zs = " ";
		for(String word : array)
		{
			if(word.indexOf("z") >= 0)
				zs += (word + " ");
		}
		return zs;
	}
}