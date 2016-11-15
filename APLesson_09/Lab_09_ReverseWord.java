import java.util.Scanner;
public class Lab_09_ReverseWord
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		
		//fills the array
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		System.out.println("In order...");
		
		for(String word : words)
		{
			System.out.print(word + " ");
		}
		System.out.println();
		System.out.println("Reversed...");
		reverse(words);
		
	}
	
	public static void reverse(String[] word)
	{
		for(int i = word.length - 1; i >= 0; i--)
		{
			System.out.print(word[i] + " ");
		}
	}
}