//The Card class is a playing card
public class Card 
{
	//these String variables hold the quantities they represent. 
	//they are private because they hide them from other classes within the folder
	private int rank;
	private int suit;
	
	//assigns the face cards a integer rank
	
	public static int Ace = 1;
	public static int Jack = 11;
	public static int Queen = 12;
	public static int King = 13;
	
	private static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; //holds the suit of the card
	private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; //holds the rank of the card
	
	//the constructor, which takes in String for cardRank and cardSuit and int for cardPointValue
	public Card(int cardSuit, int cardRank) 
	{
		this.suit = cardSuit;
		this.rank = cardRank;
	}
	
	//calls the ranks and suits arrays 
	public String toString()
	{
		return ranks[rank] + " of " + suits[suit];
	}
	
	//accessor methods for the suit and rank so that we can supply this info to the HighLow class
	public int getSuit() 
	{
		return suit;
    }

	public int getRank() 
	{
		return rank;
	}
}