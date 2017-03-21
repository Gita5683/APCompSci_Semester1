import java.util.ArrayList;
import java.util.Arrays;
public class Lab_14_2_Toyota extends Lab_14_2_Car 
{
	private double xcoor;
	private double ycoor;
	
    public Lab_14_2_Toyota(String p) 
	{
        super();
        ArrayList<String> position = new ArrayList<>(Arrays.asList(p.split(", ")));
        Double pX = Double.parseDouble(position.get(0));
		Double pY = Double.parseDouble(position.get(1));
        move(pX, pY);
    }
	
}