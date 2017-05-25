/**
 *  The deck class resembles a 52-card deck
 */
public class Deck 
{
    /**
     * Create an array of 52 cards
     */
    public Card[] deck;

    /**
     * Track the number of cards that have been dealt
     */
    public int cardsDealt;

    /**
     * Constructs a regular 52-card poker deck. Uses nested for loops
	 * to give each blank card a suit, rank, and associated point value
     */
    public Deck() 
	{
		deck = new Card[52]; // Create array with 52 blank cards
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int created = 0; // Track the number of cards that have been created.
       
		for (String s: suits)
		{
			for(String r: ranks) 
			{
				for (int value = 1; value <= 13; value++) 
				{
					deck[created] = new Card(r, s, value);
					created ++;
				}
			}
		}
        cardsDealt = 0;
    }

    /**
     * Shuffle the cards remaining in the deck
     */
    
	public void shuffle() 
	{
		for (int i = 0; i < deck.length; i++) 
		{
			int pos = (int)(Math.random() * (i + 1)); 
			Card temp = deck[i];
			deck[i] = deck[pos];
			deck[pos] = temp;
		}
		cardsDealt = 0;
	}

    /**
     * Every time the deal() method is run, the number of cards remaining 
	 * in the deck decreases by 1 and the number of cards that have been dealt
	 * increases by 1. Therefore, the number of cards left in the deck would 
	 * be the difference between the full size of the deck (52), and the 
	 * number of cards that have been dealt
     */
    public int left() 
	{
        return deck.length - cardsDealt;
    }

    /**
     * The deal() method will only execute if there are cards remaining in 
	 * the deck. As cards are dealt, the value of cardsDealt increases by 1
	 * until the user loses or all 52 cards have been dealt
     */
    public Card deal() 
	{
        if (cardsDealt == deck.length)
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