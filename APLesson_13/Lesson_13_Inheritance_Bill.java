public class Lesson_13_Inheritance_Bill extends Lesson_13_Inheritance_Money
{
	private String face;
	
	public Lesson_13_Inheritance_Bill()
	{
		super();
		this.face = "";
	}
	
	public Lesson_13_Inheritance_Bill(String n, String f, double v)
	{
		super(n, v);
		this.face = f;
	}
	
	public String scan()
	{
		return face;
	}
	
	public String toString()
	{
		return "Face: " + face + "\n" + 
				super.toString();
	}
}