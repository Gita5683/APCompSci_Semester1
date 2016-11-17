public class Lab_09_1_BiggestNumber
{
	static int numbers[];
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		fillArray(numbers);
		System.out.println("For the following numbers...");
		printArray(numbers);
		System.out.println();
		System.out.println("The biggest number is " + getBiggest(numbers));
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
	
	public static int getBiggest(int[] array)
	{
		int max = 0;
		for(int num : array)
		{
			if(num > max)
				max = num;
		}
		return max;
	}
}