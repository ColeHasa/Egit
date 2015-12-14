import java.io.*;

import javax.swing.JOptionPane;

public class Writeto {
    public static void first () {
    	String x;
        // The name of the file to open.
        String fileName = "C:\\Users\\ColeHasa\\Documents\\CodeDocs\\temp.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
           
            JOptionPane.showMessageDialog(null, "Create a username");
            
            x = JOptionPane.showInputDialog(null);
            
            bufferedWriter.write(x);

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
            
            
        }
    }
}

