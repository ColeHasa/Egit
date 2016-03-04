import javax.swing.JOptionPane;

public class Daisies extends Flowers 
{
	private String pedalColor;

public Daisies(String daisyHeight){ //variables that are specific to this type of flower
	super("Yellow");
	pedalColor = "Yellow";
	try{height = Integer.parseInt(daisyHeight);}
	catch(NumberFormatException e)
	{
		JOptionPane.showMessageDialog(null, "User value for daisies was not an integer, try again.");
		System.exit(0);}
	}
		//getters and setters
public String getPedalColor() 
	{
	return pedalColor;
	}	

public void setPedalColor(String pedalColor) 
	{
	this.pedalColor = pedalColor;
	}

	//variables that override the default super class variable
	@Override
	public int getHeight() 
	{
		return height;
	}

	@Override
	public void setHeight(int newHeight) 
	{
		height = newHeight;
		height = height + 2;
	}

}
