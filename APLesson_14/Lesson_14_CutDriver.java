import java.util.ArrayList;

public class Lesson_14_CutDriver
{
	public static void main(String[]args)
	{
		ArrayList<Lesson_14_CutShapes> cuts = new ArrayList<>();
		cuts.add(new Lesson_14_Rectangle(10,12));
		cuts.add(new Lesson_14_Circle(5));
		cuts.add(new Lesson_14_Square(9));
		
		double totalArea = 0;
		
		for(Lesson_14_CutShapes sh: cuts)
		{
			System.out.println(sh.getArea());
			totalArea += sh.getArea();
		}
		
		System.out.println("Total Wood Needed: " + totalArea + " Sq.ft");
	}
}