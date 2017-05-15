/**
 *  An object of type Deck represents a deck of playing cards.  The deck
 *  is a regular poker deck that contains 52 regular cards and that can
 *  also optionally include two Jokers.
 */
public class Deck 
{
    /**
     * An array of 52 or 54 cards.  A 54-card deck contains two Jokers,
     * in addition to the 52 cards of a regular poker deck.
     */
    public Card[] deck;

    /**
     * Keeps track of the number of cards that have been dealt from
     * the deck so far.
     */
    public int cardsDealt;

    /**
     * Constructs a regular 52-card poker deck.  Initially, the cards
     * are in a sorted order.  The shuffle() method can be called to
     * randomize the order.  (Note that "new Deck()" is equivalent
     * to "new Deck(false)".)
     */
    public Deck() 
	{
		deck = new Card[52];
		String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int created = 0; // How many cards have been created so far.
       
		for (String r: rank)
		{
			for(String s: suit) 
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
     * Put all the used cards back into the deck (if any), and
     * shuffle the deck into a random order.
     */
    /* public void shuffle() 
	{
        for (int i = deck.length-1; i > 0; i-- ) 
		{
            int position = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[position];
            deck[rand] = temp;
        }
        cardsDealt = 0;
    } */
	
	public void shuffle() 
	{
		for (int i = deck.length - 1; i > 0; i--) 
		{
			int pos = (int)(Math.random() * (i + 1)); 
			Card temp = deck[i];
			deck[i] = deck[pos];
			deck[pos] = temp;
		}
		cardsDealt = 0;
	}

    /**
     * As cards are dealt from the deck, the number of cards left
     * decreases.  This function returns the number of cards that
     * are still left in the deck.  The return value would be
     * 52 or 54 (depending on whether the deck includes Jokers)
     * when the deck is first created or after the deck has been
     * shuffled.  It decreases by 1 each time the dealCard() method
     * is called.
     */
    public int left() 
	{
        return deck.length - cardsDealt;
    }

    /**
     * Removes the next card from the deck and return it.  It is illegal
     * to call this method if there are no more cards in the deck.  You can
     * check the number of cards remaining by calling the cardsLeft() function.
     * @return the card which is removed from the deck.
     * @throws IllegalStateException if there are no cards left in the deck
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
        // Programming note:  Cards are not literally removed from the array
        // that represents the deck.  We just keep track of how many cards
        // have been used.
    }
}