public class Lab_09_1_GetOdds
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		fillArray(numbers);
		System.out.print("For the following numbers...");
		printArray(numbers);
		System.out.println();
		System.out.println("The following numbers " + getOdds(numbers) + " are odd numbers");
	}
	
	public static void fillArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random() * 100) + 1;			
		}
	}
	
	public static void printArray(int[] array)
	{
		for(int num : array)
		{
			System.out.print(num + " ");
		}
	}
	
	public static String getOdds(int[] array)
	{
		String odds = " ";
		for(int num : array)
		{
			if(num % 2 != 0)
				odds += (num + " ");
		}
		return odds;
	}
}