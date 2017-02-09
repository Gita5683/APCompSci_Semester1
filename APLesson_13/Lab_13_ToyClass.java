public abstract class Lab_13_ToyClass
{
	private String name;
	private int count; 
	
	public Lab_13_ToyClass()
	{
		this.name = "";
		this.count = 1;
	}
	
	public Lab_13_ToyClass(String n)
	{
		this.name = n;
		this.count = 1;
	}
	
	public void setCount(int c)
	{
		this.count = c;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public String getName()
	{
		return name;
	}
	
	public abstract String getType();
	
	public String toString()
	{
		return name + ": " + count;
	}
}