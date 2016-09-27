public class Lab_02
{
	public static void main(String[]args)
	{
		int a = 7;
		int b = 8;
		int multiply = a * b;
		
		System.out.println(a + " " + "multiplied by" + " " + b + " " + "is" + " " + multiply);
		System.out.println(a + " multiplied by " + b + " is " + multiply);
		
		System.out.println();
		
		String Name = "Elmo\n";
		String Address = "1313 Sesame Street\n";
		String City = "San Diego, CA";
		String Zip = " 92345";
		
		System.out.println(Name + Address + City + Zip);
		
		System.out.println();
		
		int l = 2;
		int w = 3;
		int h = 4;
		int prismSurfaceArea = 2 * (w*l + h*l + h*w);
		
		System.out.println("The surface area of your rectangle is " + prismSurfaceArea);
	}
}