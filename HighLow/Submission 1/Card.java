//The Card class is a playing card
public class Card 
{
	//these String variables hold the quantities they represent. 
	//they are private because they hide them from other classes within the folder
	private String suit; //holds the suit of the card
	private String rank; //holds the rank of the card
	private int pointValue; //holds the point value of the card
	
	
	//the constructor, which takes in String for cardRank and cardSuit and int for cardPointValue
	public Card(String cardRank, String cardSuit, int cardPointValue) 
	{
		suit = cardSuit;
		rank = cardRank;
		pointValue = cardPointValue;
	}
	
	//accessor methods for the suit, rank and pointValue so that we can supply this info to the HighLow class
	public String suit() 
	{
		return suit;
    }

	public String rank() 
	{
		return rank;
	}

	public int pointValue() 
	{
		return pointValue;
	}

}