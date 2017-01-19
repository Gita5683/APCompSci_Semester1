public class Lab_12_2_Inventory
{
	private String manufacturer;
	private String name;
	private String category;
	private int UPC;
	private double price;
	
	
	public Lab_12_2_Inventory()
	{
		manufacturer = "";
		name = "";
		category = "";
		UPC = 0;
		price = 0.0;
	}
	
	public Lab_12_2_Inventory(String m, String n)
	{
		manufacturer = m;
		name = n;
		category = "Unknown";
		price = 0.0;
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	
	public Lab_12_2_Inventory(String m, String n, String c, double p)
	{
		manufacturer = m;
		name = n;
		category = c;
		price = p;
		UPC = (int)(Math.random() * 1000000000) + 1;
		
	}
	
	public String toString()
	{
		return "Item Info...\nManufacturer: " + manufacturer + 
							"\nName: " + name + 
							"\nCategory: " + category + 
							"\nPrice: " + price + 
							"\nUPC: " + UPC;
	}
}	