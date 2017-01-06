public class Lesson_12_UserNamesRunner
{
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