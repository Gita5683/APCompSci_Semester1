import java.util.Scanner;
public class Lesson_05_2_Choices
{
	public static void main(String[]args)
	{
		int number = 3;
		
		if(number > 4)
		{
			System.out.println("It meets one of the conditions");
			if(number <= 10)
			{
				System.out.println("It meets the two conditions");
			}
		}
		else
		{
			System.out.println("It meets none of the conditions");
		}
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to..." +
							"\n 1. Do a math problem" +
							"\n 2. Answer a question");
		int mathOrWords = kb.nextInt();
		if(mathOrWords == 1)
		{
			System.out.println("What is 2 x 2?");
			int mathAnswer = kb.nextInt();
			if(mathAnswer == 4)
			{
				System.out.println("Correct!");
			}
			else
				System.out.println("No! Wrong! You Lose!");
		}
		else
		{
			System.out.println("Who said the phrase \" Whatever you are, be a good one.\" ?");
			kb.nextLine();
			String wordAnswer = kb.nextLine();
			if(wordAnswer.equals("Abraham Lincoln"))
			{
				System.out.println("Correct!");
			}
			else
				System.out.println("No! Wrong! You Lose!");
		}
	}
}
