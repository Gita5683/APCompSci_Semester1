
//The deck class resembles a 52-card deck

public class Deck 
{
    //Create an array of 52 cards
    private Card[] deck;
	int n;

    //Track the number of cards that have been dealt

    private int cardsDealt;

    //Constructs a regular 52-card poker deck. Uses nested for loops to give each blank card a suit and rank

    public Deck() 
	{
		n = 51;
		deck = new Card[52];
		int created = 0;
		for (int i = 0; i <= 3; i++)
		{
			for (int j = 0; j <= 12; j++)
			{
				deck[created] = new Card(i, j);
				created++;
			}
		}
    }

//Shuffle the cards remaining in the deck

	public void shuffle() 
	{
		for (int i = deck.length - 1; i > 0; i--) 
		{
			int pos = (int)(Math.random() * (i + 1)); 
			Card temp = deck[i];
			deck[i] = deck[pos];
			deck[pos] = temp;
		}
		
	}
	
    /**
     * The deal() method will only execute if there are cards remaining in 
	 * the deck. As cards are dealt, the value of cardsDealt increases by 1
	 * until the user loses or all 52 cards have been dealt
     */
    public Card deal() 
	{
        if (n == 0)
		{
			System.out.println("All cards have been dealt.");
		}
        else
		{
			cardsDealt++;
		}			
        
		return deck[cardsDealt - 1];
    }
}