public class Lesson_12_OOParchitecture
{
	//instance variables
	private String userName, firstName, lastName;
	
	//default constructor
	public Lesson_12_OOParchitecture()
	{
		//default values for instance variables
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	//constructor with parameters
	public Lesson_12_OOParchitecture(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//modifiers a.k.a mutators a.k.a setters
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//accessors

	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
		
	public String getLastName()
	{
		return lastName;
	}
		
	public static void main(String[]args)
	{
		Lesson_12_OOParchitecture object = new Lesson_12_OOParchitecture("proHndsm", "Professor", "Handsome");
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
		
		Lesson_12_OOParchitecture object1 = new Lesson_12_OOParchitecture();
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object1.getFirstName() + " " + object1.getLastName());
		System.out.println("User Name: " + object1.getUserName());
		
		object.setUserName("pHandsome");
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
	}

}
