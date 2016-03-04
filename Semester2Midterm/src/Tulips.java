import javax.swing.JOptionPane;

public class Tulips extends Flowers{
		private String pedalColor;

		public Tulips(String tulipHeight)
				{ //variables that are specific to this type of flower
				super("Purple");
					pedalColor = "Purple";
						try{height = Integer.parseInt(tulipHeight);
					}
						catch(NumberFormatException e)
						{
									JOptionPane.showMessageDialog(null, "User value for tulips was not an integer, try again.");
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
		
		//variables that override the default superclass vvariables
		@Override
		public int getHeight() 
		{
			return height;
		}

		@Override
		public void setHeight(int newHeight) 
		{
			height = newHeight;
			height = height + 1;
		}

}