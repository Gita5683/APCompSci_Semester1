public class Lesson_13_Inheritance_Coin extends Lesson_13_Inheritance_Money
{
	private String weight;
	
	public Lesson_13_Inheritance_Coin()
	{
		super();
		this.weight = "";
	}
	
	public Lesson_13_Inheritance_Coin(String n, String w, double v)
	{
		super(n, v);
		this.weight = w;
	}
	
	public String scan()
	{
		return weight;
	}
	
	public String toString()
	{
		return "Weight: " + weight + "g\n" + 
				super.toString();
	}
}