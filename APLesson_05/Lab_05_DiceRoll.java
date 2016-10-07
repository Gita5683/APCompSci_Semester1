import java.util.Random;
public class Lab_05_DiceRoll
{
	public static void main(String[]args)
	{
		Random random = new Random();
		int player = random.nextInt(6)+1;
		int computer = random.nextInt(6)+1;
		String winner = rollDice(player, computer);
		
		System.out.println("You rolled a " + player);
		System.out.println("The computer rolled a " + computer);
		System.out.println("The winner is " + winner);	
	}
	
	public static String rollDice(int p, int c)
	{
		String winner = " ";
		
		if(p > c)
		{
			winner = "player";
		}
		
		if(p < c)
		{
			winner = "computer";
		}
		
		return winner;
	}
}