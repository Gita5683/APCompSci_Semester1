import java.util.Scanner;
public class Lab_13_ToyStoreRunner
{
	public static void main(String[]args)
	{
		String toysList = "";
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter in a list of toys: ");
		toysList = kb.nextLine();
		
		Lab_13_ToyStoreClass toy = new Lab_13_ToyStoreClass(toysList);
		System.out.println(toy);
		System.out.println("Most Frequent Toy: " + toy.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + toy.getMostFrequentType());
	}
}