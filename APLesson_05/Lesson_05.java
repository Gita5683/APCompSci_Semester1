public class Lesson_05
{
	public static void main(String[]args)
	{
		int num = 3;
		
		if(num == 3)
		{
			System.out.println("num equals 3!");
		}
		
		if(num == 5)
		{
			System.out.println("num equals 5!");
		}

		boolean tOrF = false;
		
		if(tOrF)
		{
			System.out.println("It is true!");
		}
		
		if(!tOrF)
		{
			System.out.println("It is false!");
		}
		
		if(tOrF())
		{
			System.out.println("It is true w/ method!");
		}
		
		if(!tOrF())
		{
			System.out.println("It is false w/ method!");
		}
		
	}
	
	public static boolean tOrF()
	{
		return 2>=5;
	}
}