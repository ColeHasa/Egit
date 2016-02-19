
public class Tree {
	
String barkcolor; //state variables
String leafcolor;
int drinkwater; //int variable

	public Tree(String leafColor)
	{
		barkcolor = "brown";    //initiate variables
		leafcolor = leafColor;
		drinkwater = 1;
	}

	public String getBarkcolor() {
		return barkcolor;
	}

	public void setBarkcolor(String barkcolor) {
		this.barkcolor = barkcolor;
	}

	public String getLeafcolor() {
		return leafcolor;
	}

	public void setLeafcolor(String leafColor) {
		leafcolor = leafColor;
	}

	public int getDrinkwater() {
		return drinkwater;
	}

	public void setDrinkwater(int drinkwater) {
		this.drinkwater = drinkwater;
	}
	
	
}
