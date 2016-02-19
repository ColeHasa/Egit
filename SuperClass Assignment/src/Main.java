import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		
		Tree[] trees = new Tree[3]; //instantiating tree array
		trees[0] = new Tree("Green");
		trees[1] = new Tree("Red");
		trees[2] = new Tree("Yellow");
		
		Object[] mytrees = new Object[2]; //instantiating object array
		mytrees[0] = new Evergreen();
		mytrees[1] = new maple();
		
		try{ //testing input for validity with exception catching
			String waterdrink = JOptionPane.showInputDialog("Does tree drink water? (1 for yes, 2 for no)");
			int water = Integer.parseInt(waterdrink);
		}
		catch (NumberFormatException e){
			System.out.println("Please use a number");
		};
		
		try{ //looking to make sure they exist
			((Evergreen) mytrees[0]).setLocation("Mountains");
			((maple) mytrees[1]).setLocation("California");
		
			((Evergreen) mytrees[0]).setBarkcolor("brown");
			((maple) mytrees[1]).setDrinkwater(1);
		} catch(NullPointerException e){
			System.out.println("One of the object doesn't exist. Sorry.");
		}
	}

}
