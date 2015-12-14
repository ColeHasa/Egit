import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.JFrame;

public class Checkers  {
	
   /*A lot of the layout for the game came from this website http://www.brainycode.com/downloads/Building2DPlatformerV10.pdf
    * which offered me much help in game creation in general, offers a great way to learn how game logic and loops are setup */
	//also received logic help from http://math.hws.edu/eck/cs124/javanotes3/source/Checkers.java
	public Checkers(){
		init();
	}
	
   private void init() {

	   JFrame frame = new JFrame("checkers for ");
      frame.setLayout(null);  // layout in sizing
      
      frame.setBackground(new Color(0,100,30));  

      CheckersCanvas board = new CheckersCanvas();
        
      frame.add(board); //the constructor creates the two needed buttons

      board.newGameButton.setBackground(Color.lightGray);
      frame.add(board.newGameButton);

      board.message.setForeground(Color.green);
      board.message.setFont(new Font("Serif", Font.BOLD, 14));
      frame.add(board.message); //Set the position and size of each component by calling
     // its setBounds() method.
      board.setBounds(20,20,164,164); //setting bounds for board
      board.newGameButton.setBounds(210, 60, 100, 30);
      board.message.setBounds(0, 200, 330, 30);
      frame.setSize(220, 250);
      frame.setVisible(true);
   }
  
} 
