public class Lab_12_1_Human
{
	private String hair, eyes, skin;
	
	public Lab_12_1_Human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public Lab_12_1_Human(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setHair(String h)
	{
		hair = h;
	}
	public void setEyes(String e)
	{
		eyes = e;
	}
	public void setSkin(String s)
	{
		skin = s;
	}
	
	public String getHair()
	{
		return hair;
	}
	public String getEyes()
	{
		return eyes;
	}
	public String getSkin()
	{
		return skin;
	}
}	