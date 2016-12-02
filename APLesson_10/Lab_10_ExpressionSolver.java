import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Lab_10_ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an expression: ");
		String expression = kb.nextLine();
		
		ArrayList<String>Nexpression = new ArrayList<>(Arrays.asList(expression.split(" ")));
		System.out.print(doEquation(Nexpression));
	}
	
	public static ArrayList<String> doEquation(ArrayList<String>equation)
	{
		int i = 0;
		while(i < equation.size())
		{
			if(i < equation.size() && (equation.get(i).equals("*") || equation.get(i).equals("/")))
			{
				if(equation.get(i).equals("*"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1))));
				}
				else
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}
			else
			{
				i++;
			}
		}
		
		int j = 0;
		while(j < equation.size())
		{ 
			if(j < equation.size() && (equation.get(j).equals("+") || equation.get(j).equals("-")))
			{
				if(equation.get(j).equals("+"))
				{
					equation.set(j, "" + (Integer.parseInt(equation.get(j-1)) + Integer.parseInt(equation.get(j+1))));

				}
				else
				{
					equation.set(j, "" + (Integer.parseInt(equation.get(j-1)) - Integer.parseInt(equation.get(j+1))));
				}
				equation.remove(j-1);
				equation.remove(j);
			}
			
			else
			{
				j++;
			}
		}
		return equation;
	}
}