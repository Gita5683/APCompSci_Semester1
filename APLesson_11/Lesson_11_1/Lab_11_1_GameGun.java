import java.util.Scanner;
import java.util.Arrays;

public class Lab_11_1_GameGun
{
	static int bulletCount;
	static int clipSize = 16;
	static int shotCount;
	static String [] clip;
	
	public static void main(String[]args)
	{
		bulletCount = 96;
		shotCount = 0;
		clip = new String[clipSize];
		
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Action: ");
			String action = kb.next();
			if(action.equals("R"))
			{
				reload();	
			}
			if(action.equals("S"))
			{
				System.out.println(shoot());
			}
			printClip();		
		}
		System.out.println("Out of bullets!");
	}	
	
	public static void resetClip()
	{ 
		for(int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount -= 1;
			return "Boom!!!";
		}
		else
			return "Reload!!!";
	}
	
	public static void reload()
	{
		if(bulletCount >= clipSize)
		{
			bulletCount -= clipSize;
			shotCount = clipSize;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}	
			
		resetClip();
	
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	public static void printClip()
	{
		String output = " ";
		System.out.println("Bullets: " + "\t" + bulletCount + "\n" + "Clip: " + "\t");
		for(int i = 0; i < clipSize; i++)
		{
			output += clip[i];
		}
		
		System.out.println(output);
	}
}