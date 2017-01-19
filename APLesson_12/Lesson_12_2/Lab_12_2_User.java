public class Lab_12_2_User
{
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	
	
	public Lab_12_2_User()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	
	public Lab_12_2_User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public Lab_12_2_User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
		
	}
	
	public void setAvatar(String av)
	{
		avatar = av;
	}
	
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName + 
								"\nLast Name: " + lastName + 
								"\nAvatar: " + avatar + 
								"\nUser ID#: " + userID;
	}
}