/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card a = new Card("7", "Diamonds", 3);
		Card b = new Card("2", "Clubs", 3);
		Card c = new Card("10", "Hearts", 3);
		Card d = new Card("2", "Spades", 3);
		
		System.out.println("Does b match c?" + " " + b.matches(c));
		System.out.println("Does a match c?" + " " + a.matches(c));
		System.out.println("Card b:" + " " + d.toString());
		System.out.println("Card d:" + " " + d.toString());
		System.out.println("Suit of Card d: " + d.suit());

	}
}
