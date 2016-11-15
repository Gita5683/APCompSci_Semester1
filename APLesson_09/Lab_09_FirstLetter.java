import java.util.Scanner;
public class Lab_09_FirstLetter
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
		first(words);
	}
	
	public static void first(String[] word)
	{
		for(int i = 0; i < word.length; i++)
		{
			System.out.print(word[i].charAt(0) + " ");
		}
	}
}