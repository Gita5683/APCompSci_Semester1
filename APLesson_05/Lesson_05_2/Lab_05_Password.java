import java.util.Scanner;
public class Lab_05_Password
{
	static String username;
	static String password;
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);	
		username = "gitamultani";
		password = "1234";
		passCheck();
	}
	
	public static void passCheck()
	{
		System.out.println("Please enter your username: ");
		String usernameG = kb.next();
		System.out.println("Please enter your password: ");
		String passwordG = kb.next();
		if(usernameG.equals(username) && passwordG.equals(password))
		{
			System.out.println("You are granted access!");
		}
		else if(usernameG.equals(username) || passwordG.equals(password))
		{
			if(usernameG.equals(username))
			{
				System.out.println("Your password is incorrect!");
				passCheck();
			}
			else
			{
				System.out.println("Your username is incorrect!");
				passCheck();
			}
		}
		else
		{
			System.out.println("Your username and password are incorrect!");
			passCheck();
		}
	}
}