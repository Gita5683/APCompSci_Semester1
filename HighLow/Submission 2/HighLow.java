import java.util.Scanner;
public class HighLow
{
	public static void main(String[] args)
	{
		System.out.println("");
		System.out.println("~*~*~ WELCOME TO THE HIGHLOW CARD GAME ~*~*~");
		System.out.println("________________________________________________");
		System.out.println("");
		System.out.println("OBJECTIVE:");
		System.out.println("In HighLow, you are randomly given the value");
		System.out.println("of a card and must predict whether the next card");
		System.out.println("in the deck will have a value higher or lower than");
		System.out.println("the current card.");
		System.out.println("");
		System.out.println("HOW TO PLAY:");
		System.out.println("You must enter high if you think the next card will be ");
		System.out.println("higher or low if you think the next card will be lower. ");
		System.out.println(" ");
		System.out.println("HOW TO WIN:");
		System.out.println("If your guess is correct you gain a point.");
		System.out.println("If your guess is incorrect,");
		System.out.println("you lose the game and the total number of");
		System.out.println("points you have accumulated is your final score.");
		System.out.println("________________________________________________");
		
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
      System.out.println("CARD: " + yourCard);
	  System.out.println();
	  
      while (true)
	  { 
		System.out.println("Type your guess below.");
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
			System.out.println("CARD: " + yourCard);
		}
      }
	  
	System.out.println();
    System.out.println("Points: " + rightGuesses);
	System.out.println("It's over! Now go get a life. ");
      
    return rightGuesses;
      
   }  // end game()
}