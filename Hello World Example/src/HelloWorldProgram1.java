import javax.swing.JOptionPane;
import java.util.Scanner;

public class HelloWorldProgram1 {

	public static void main(String[] args) {
		
		String mainpassword = ("icanthandle");
		String userInput = null;
		Scanner Password = new Scanner (System.in);
			System.out.println("Enter Password");
		while(true) {
		    userInput = Password.nextLine();

		    if (userInput.equals(mainpassword)){
		        break;
		    } else {
		        System.out.println("Access Denied");
		        System.out.println("Enter Password Again");
		    }
		}

		System.out.println("Access Granted");
		System.out.println("Welcome!");
		
		Scanner input = new Scanner(System.in); //Opens Scanner
	
		String u;
		u = JOptionPane.showInputDialog("What is your name?");
		
		
		
		/*System.out.println("Username:"); //Print text to console
		String username = input.nextLine();
		
		System.out.println("Password:");
		String  password = input.nextLine();
		*/
		/*
		System.out.println("Hi");
		
		try {Thread.sleep(1000);} //stop program 1000 milliseconds
		catch (Exception e){};
		System.out.println("How are you doing?"); 
		
		try {Thread.sleep(1000);}
		catch (Exception e){};
		System.out.println("do you feel like you are the right age?");
		
		try {Thread.sleep(1000);}
		catch (Exception e){};
		System.out.println("Ever felt too young or too old?");
		
		try {Thread.sleep(1000);}
		catch (Exception e){};
		System.out.println("Lets find out how old you should be");
		 */
	
	{	
	String FirstNumber = 
			JOptionPane.showInputDialog("How many siblings do you have?");
			//first variable
	String secondNumber =
			JOptionPane.showInputDialog("How many siblings did your mother have?");
			//second variable
	
		int number1 = Integer.parseInt(FirstNumber);
		int number2 = Integer.parseInt(secondNumber);
		int sum = ((number1 + 1) + (1 + number2)) / 2; //add variables together
	
	JOptionPane.showMessageDialog(null, "This is how many kids you will have: " + sum,
			"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
	
	
	String z;
	z = "you're old"; //sets joptionpane title
	
	z = JOptionPane.showInputDialog("Whats your favorite color");
		JOptionPane.showMessageDialog(null, "How will it feel to have " + sum + " kids?", "fancy title", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, z + " will not be their favorite color");
		
	
	
	input.close();
	
	JOptionPane.showMessageDialog(null, "have a great day " + u);
	}
}
	
}