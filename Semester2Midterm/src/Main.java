import javax.swing.JOptionPane;
import java.util.*;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

public static void main(String[] args) throws IOException {
	
	 // Instantiate a Date object
    Date date = new Date();

    // display time and date using toString()
    System.out.println(date.toString());

Flowers[] flowers = new Flowers[3]; //object array of flower colors
flowers[0] = new Flowers("Green"); 
flowers[1] = new Flowers("Red");
flowers[2] = new Flowers("White");


String tulipHeight = JOptionPane.showInputDialog(null, "How tall are your Tulips? (inches)"); //questions that i ask about their flowers
String daisyHeight = JOptionPane.showInputDialog(null, "How tall are your Daisies? (inches)");

Object[] myflowers = new Object[2]; //an unidentified array of objects
myflowers[0] = new Tulips(tulipHeight);
myflowers[1] = new Daisies(daisyHeight);

try{
((Tulips) myflowers[0]).setPedalColor("Purple"); //sets the pedal colors of the fowers
((Daisies) myflowers[1]).setPedalColor("Yellow");
}catch(NullPointerException e){ //catches a null pointer exception and displays a message
System.out.println("One of the object doesn't exist. Sorry!");
System.exit(0);
}

try{ //sets the height of the flowers
((Tulips) myflowers[0]).setHeight(Integer.parseInt(tulipHeight));
}
catch(NumberFormatException e){
JOptionPane.showMessageDialog(null, "User value for tulips was not an integer, try again.");
System.exit(0);
}
try{ //another user input that sets the height converts the string to an integer
((Daisies) myflowers[1]).setHeight(Integer.parseInt(daisyHeight));
}
catch(NumberFormatException e){  //catching anything other than numbers
JOptionPane.showMessageDialog(null, "User value was not an integer, try again.");
System.exit(0);
}
String[] arr= null; //starting array with file
  List<String> itemsSchool = new ArrayList<String>();
  try 
  { 
      FileInputStream fstream_school = new FileInputStream("C:\\Users\\ColeHasa\\Documents\\cole\\Carroll\\Classes\\Computer Science\\array.txt"); 
      DataInputStream data_input = new DataInputStream(fstream_school); 
      BufferedReader buffer = new BufferedReader(new InputStreamReader(data_input)); 
      String str_line; 

      while ((str_line = buffer.readLine()) != null) 
      { 
          str_line = str_line.trim();  //string operation
          if ((str_line.length()!=0))  
          { 
              itemsSchool.add(str_line);
          } 
      }

      arr = (String[])itemsSchool.toArray(new String[itemsSchool.size()]);
       
       
   

  }finally{}
   
new Output(tulipHeight, daisyHeight); //final questions

String[] options = new String[] {"Tulips", "Dasies"}; //new string for joptionpane
int check = JOptionPane.showOptionDialog(null, "Which value would you like to check?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, options[0]);

if(check == 0){
	JOptionPane.showMessageDialog(null, "The height you entered for your tulips was: " + tulipHeight);
}
else{
	JOptionPane.showMessageDialog(null, "The height you entered for your daisies was: " + daisyHeight);
}
}

}