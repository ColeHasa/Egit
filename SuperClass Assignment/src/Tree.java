
public class Tree {
	
String barkcolor;
String leafcolor;
int drinkwater;

	public Tree(String leafColor)
	{
		barkcolor = "brown";
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
