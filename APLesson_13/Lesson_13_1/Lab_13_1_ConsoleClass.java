public abstract class Lab_13_1_ConsoleClass extends Lab_13_1_GameSystemClass
{
	private String controller;
	
	public Lab_13_1_ConsoleClass()
	{
		super();
	}
	
	public Lab_13_1_ConsoleClass(String c)
	{
		super(c);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getSerialNo() + "\nController : " + getController();
	}
	
}