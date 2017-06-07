import java.util.Scanner;
public class HighLow
{
	public static void main(String[] args)
	{
		System.out.println("INSTRUCTIONS:");
		System.out.println("You will be playing a card game called HighLow. In HighLow, the user is randomly given the value");
		System.out.println("of a card and must predict whether the next card in the deck will have a value higher or lower than");
		System.out.println("the current card. If their prediction is incorrect, the user loses and the total number of points they");
		System.out.println("have accumulated is their final score.");
		
		game();
    } 
  
   private static int game() 
   {
	  Scanner kb = new Scanner(System.in);
   
      Deck deck = new Deck();  
      int rightGuesses = 0;
	  deck.shuffle();
      Card yourCard = deck.deal();  
	  Card nextCard; 
      String guess;  
      //rightguesses = 0;
      //currentcard = deck.deal();
	  System.out.println();
      System.out.println("The first card is: " + yourCard);
	  
      while (true)
	  { 
        System.out.println("Enter high if you think the next card will be higher. ");
		System.out.println("Enter low if you think the next card will be lower. ");
		guess = kb.nextLine();
		System.out.println();
		 
        if (!guess.equals("high") && !guess.equals("low")) 
		{
			System.out.println("Enter high or low plz. ");
		}
		
		else
		{
			nextCard = deck.deal();
         
			if (nextCard.getRank() == yourCard.getRank()) 
			{
				System.out.println("Plot twist! The value was neither higher nor lower. It's a tie! You lose. Sucks to suck.");
				break;  // ends the game.
			}
		 
			else if (nextCard.getRank() < yourCard.getRank()) 
			{
				if (guess.equals("low")) 
				{
					System.out.println("You're right! YAS GIRL! You get a point");
					rightGuesses++;
				}
				else 
				{
					System.out.println("NOPE SUCKA. BYE FELICIA!");
					break; 
				}
			}
			else 
			{  
				if (guess.equals("high")) 
				{
					System.out.println("YUPPERONI. What a player. DAMN SON. You get a point.");
					rightGuesses++;
				}
				else 
				{
					System.out.println("Frankly, my dear, no. You lost. SAD. ");
					break; 
				}
			}
			
			yourCard = nextCard;
			System.out.println();
			System.out.println("Your next card is " + yourCard);
		}
      }
	  
	System.out.println();
    System.out.println("Points: " + rightGuesses);
	System.out.println("It's over! Now go get a life. ");
      
    return rightGuesses;
      
   }  // end game()
   
   public void format(String item, double price)
	{
		System.out.printf("\n*\t%15s . . . . . . . . %10.2f", item, price);
	}
}