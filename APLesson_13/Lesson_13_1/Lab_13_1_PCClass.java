public class Lab_13_1_PCClass extends Lab_13_1_GameSystemClass
{
	public Lab_13_1_PCClass()
	{
		super();
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public Lab_13_1_PCClass(String c)
	{
		super(c);
	}
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getSerialNo() + "\nSystem Input : " + systemInput();
	}
}