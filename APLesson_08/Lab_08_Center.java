import java.util.Scanner;
public class Lab_08_Center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter first word: ");
		String word1 = kb.next();
		System.out.println("Please enter second word: ");
		String word2 = kb.next();
		System.out.println("Please enter third word: ");
		String word3 = kb.next();
		
		System.out.print(makeCenter(word1) + "\n" + makeCenter(word2) + "\n" + makeCenter(word3));
	}
	
	public static String makeCenter(String word)
	{
		if (word.length() >= 20) 
			return word;
		else
			return makeCenter(" " + word + " ");
	}
}