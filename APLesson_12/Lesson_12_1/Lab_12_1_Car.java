public class Lab_12_1_Car
{
	private String paint, interior, engine, tires;
	
	public Lab_12_1_Car()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	
	public Lab_12_1_Car(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public void setCustomPaint(String p)
	{
		paint = p;
	}
	public void setCustomInterior(String i)
	{
		interior = i;
	}
	public void setCustomEngine(String e)
	{
		engine = e;
	}
	public void setCustomTires(String t)
	{
		tires = t;
	}
	
	public String getPaint()
	{
		return paint;
	}
	public String getInterior()
	{
		return interior;
	}
	public String getEngine()
	{
		return engine;
	}
	public String getTires()
	{
		return tires;
	}
}