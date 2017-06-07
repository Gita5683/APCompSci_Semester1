import java.util.Scanner;
public class HighLow
{
	public static void main(String[] args)
	{
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
      int rightguesses;
      //Card currentcard;  
	  Card nextcard; 
      String guess; 
      deck.shuffle(); 
      rightguesses = 0;
      Card currentcard = deck.deal();
      System.out.println("The first card is " + currentcard);
	  
      while (true)
	  { 
        System.out.println("Enter high if you think the next card will be higher. ");
		System.out.println("Enter low if you think the next card will be lower. ");
		guess = kb.nextLine();
		 
        while (guess != "high" && guess != "low") 
		{
           if (guess != "high" && guess != "low") 
		   {
			   System.out.println("Enter high or low plz. ");
		   }

        } 
        
        nextcard = deck.deal();
        System.out.println(nextcard + "is the next card.");
         
        if (nextcard.pointValue() == currentcard.pointValue()) 
		{
           System.out.println("Plot twist! The value was neither higher nor lower. It's a tie! You lose. Sucks to suck.");
           break;  // ends the game.
        }
		 
        else if (nextcard.pointValue() < currentcard.pointValue()) 
		{
           if (guess == "low") 
			{
                System.out.println("You're right! YAS GIRL! You get a point");
                rightguesses++;
            }
            else 
			{
                System.out.println("NOPE SUCKA. BYE FELICIA!");
                break; 
            }
        }
        else 
		{  
            if (guess == "high") 
			{
                System.out.println("YUPPERONI. What a player. DAMN SON. You get a point.");
                rightguesses++;
            }
            else 
			{
                System.out.println("Frankly, my dear, no. You lost. SAD. ");
                break; 
            }
        }
         
		currentcard = nextcard;
        System.out.println("Your current card is " + currentcard);
         
      }
      
    System.out.println("It's over! Now go get a life. ");
    System.out.println("You made " + rightguesses + " right guesses.");
      
    return rightguesses;
      
   }  // end game()
   

}