import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab_13_ToyStoreClass
{
	ArrayList <Lab_13_ToyClass> toyList;
	public Lab_13_ToyStoreClass()
	{
		toyList = new ArrayList<Lab_13_ToyClass>();
	}
	
	public Lab_13_ToyStoreClass(String ts)
	{
		loadToys(ts);
	}
	
	public void loadToys(String ts)
	{
		toyList = new ArrayList<Lab_13_ToyClass>();
		ArrayList <String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i += 2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Lab_13_ToyClass t = getThatToy(name);
			if(t == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new Lab_13_CarClass(name));
				}
				if(type.equals("AF"))
				{
					toyList.add(new Lab_13_AFigureClass(name));
				}
			}
			
			else
			{
				t.setCount(t.getCount() + 1);
			}
		}
	}
	
	public Lab_13_ToyClass getThatToy(String nm)
	{
		for(Lab_13_ToyClass t : toyList)
		{
			if(t.getName().equals(nm))
				return t;
		}
		
		return null;
	}

	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Lab_13_ToyClass t : toyList)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}				
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Lab_13_ToyClass t : toyList)
		{
			if(t.getType().equals("Car"))
			{
				cars ++;
			}
			
			if(t.getType().equals("Action Figure"))
			{
				figures ++;
			}
		}
		
		if(cars < figures)
		{
			return "Figures";
		}
		if(cars > figures)
		{
			return "Cars";
		}
		else
		{
			return "Equal number of action figures and cars";
		}
	}
	
	public String toString()
	{
		String output = "";
		for (Lab_13_ToyClass t : toyList)
		{
			output += "" + t;
		}
		
		return "\nToys in inventory...\n" + output + "\n";
	}
}