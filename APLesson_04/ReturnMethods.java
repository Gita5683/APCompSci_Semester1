//public class ReturnMethods
//{
//	public static void main(String[]args)
//	{
//		ReturnMethods volCube = new ReturnMethods();
//		int side1 = 3;
//		System.out.println(volCube.cube(side1));
//	}
	
//	public int cube(int side)
//	{
//		return side*side*side;
//	}
//}

public class ReturnMethods
{
	public static void main(String[]args)
	{
		ReturnMethods average = new ReturnMethods();
		int n1 = 3;
		int n2 = 8;
		int n3 = 15;
		double avg = average.calcAverage(n1, n2, n3);
		System.out.printf("The volume of your cube is %10.2f\n", avg);
	}
	
	public double calcAverage(int one, int two, int three)
	{
		return (one+two+three)/3.0;
	}
}