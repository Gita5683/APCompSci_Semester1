public class Lab_13_1_GameSystemClass
{
	private String platform;
	private int serialNo;
	
	public Lab_13_1_GameSystemClass()
	{
		this.platform = "";
		this.serialNo = 0;
	}
	
	public Lab_13_1_GameSystemClass(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random() * 10000000) + 1;
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
}