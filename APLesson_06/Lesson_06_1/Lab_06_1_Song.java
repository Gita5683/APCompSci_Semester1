public class Lab_06_1_Song
{
	public static void main(String[]args)
	{
		sing("Na", 4);
		System.out.println(" ");
		sing("Na", 4);
		System.out.println(" ");
		sing("Hey", 3);
		System.out.println(" ");
		sing("Goodbye!", 1);
	}
	
	public static void sing(String word, int repeat)
	{
		for(int i = 0; i < repeat; i++)
		{
			System.out.print(word + "\t");
		}
	}
}