import java.util.Scanner;
public class Lab_13_1_GameRunner
{
	public static void main(String[]args)
	{
		Lab_13_1_PlayStationClass ps = new Lab_13_1_PlayStationClass("PS3");
		System.out.println(ps);
		
		Lab_13_1_XBoxClass xbs = new Lab_13_1_XBoxClass("XBox 360");
		System.out.println(xbs);
		
		Lab_13_1_PCClass pc = new Lab_13_1_PCClass("PC");
		System.out.println(pc);
	}
}