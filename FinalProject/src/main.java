import java.util.Scanner;

import javax.swing.JOptionPane;

public class main 
{
	
	public static void main(String[] args) 
	{
		String u;
		u = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello " + u);
		
		String bestpassword = ("y");
		String userInput = null;
		Scanner Password = new Scanner (System.in);
			System.out.println("Do you like strategy games? (y/n) (anything other than those will be taken as a no)");
			
			
		while(true)
		{
		    userInput = Password.nextLine();
		    if (userInput.equals(bestpassword)){
		    	System.out.println("Enjoy Checkers!");
		  	   try {Thread.sleep(3000);
		 } //stop program 3000 milliseconds
		 			catch (Exception e){};
		    	Checkers checkers = new Checkers();
		        break;
		    } else 
		    {
		    	 System.out.println("Well I have another question then");
		    	 try {Thread.sleep(1000);
		    } //stop program 1000 milliseconds
		   			catch (Exception e){};
		    	  System.out.println("do you like wordgames? (y/n) (anything other than those will be taken as a no)");
		    	 while(true) 
		    	 	{
		 		    userInput = Password.nextLine();
		 		    if (userInput.equals(bestpassword)){
		 		   	try {Thread.sleep(3000);} //stop program 1000 milliseconds
		 		   	catch (Exception e){};
		 		    	Hangman.main();
		 		        break;
		 		    } else 
		 		    {
		 		    	 System.out.println("Enjoy Snake then, you hater of so many games :)");
		 		    	try {Thread.sleep(3000);} //stop program 1000 milliseconds
			   			catch (Exception e){};
		 		    	new Snake();
		 		    	break;
		 		    } 
		        
		    	 }
		    	 }
		    }
		}
	}



